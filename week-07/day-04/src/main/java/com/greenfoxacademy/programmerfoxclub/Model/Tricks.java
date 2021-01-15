package com.greenfoxacademy.programmerfoxclub.Model;


public enum Tricks {
    ONE {
        @Override
        public String toString() {
            return "write HTML";
        }
    },

    TWO {
        @Override
        public String toString() {
            return "code in Java";
        }
    },



    THREE {
        @Override
        public String toString() {
            return "play Exploding Kittens";
        }
    }



}