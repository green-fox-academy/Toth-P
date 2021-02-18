package com.example.weekzero.ControllerForAll;


import com.example.weekzero.JWT.AuthenticationRequest;
import com.example.weekzero.JWT.AuthenticationResponse;
import com.example.weekzero.JWT.JwtUtil;
import com.example.weekzero.Retrofit.MainService;
import com.example.weekzero.Retrofit.MovieDTO;
import com.example.weekzero.Retrofit.TopRatedDTO;
import com.example.weekzero.Security.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {


    @Autowired
    private MainService mainService;


    @GetMapping("/get-movie/{id}")
    public ResponseEntity<MovieDTO> getMovieById(@PathVariable Integer id) {

        MovieDTO movie = mainService.getMovieById(id);


        return ResponseEntity.ok(movie);

    }

    @GetMapping("/top-rated")
    public ResponseEntity<?> getTopRated() {
        TopRatedDTO topRated = mainService.getTopRated();
        return ResponseEntity.ok(topRated.getResults());
    }

    @GetMapping("/")
    public String home() {
        return ("Welcome");
    }

    @GetMapping("/user")
    public String user() {
        return ("Welcome User");
    }


    @GetMapping("/admin")
    public String admin() {
        return ("Welcome Admin");
    }


    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return ("Hello");
    }

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }


        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());
        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));

    }


}

