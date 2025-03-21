package com.mylab.main.asd;

import jdk.internal.loader.Resource;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i< fields.lenght; i++){
            Annotation d = fields[i].get.Annotation(Resource.class);
                if(d != null){
                    System.out.println(fields[i].getName());
                }
        }
    }
}
