package com.greenfoxacademy.programmerfoxclub.Model;

public enum Drinks {

    ONE {
        @Override
        public String toString() {
            return "Water";
        }
    },

    TWO {
        @Override
        public String toString() {
            return "Cola";
        }
    },

    THREE {
        @Override
        public String toString() {
            return "RedBull";
        }
    }


}