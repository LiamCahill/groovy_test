package com.cahill.groovy

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import org.apache.groovy.json.internal.IO

class Slurper {

    static void main(String[] args) {
        SlurperTest();
        ToSerialize();

    }

    static void SlurperTest(){
        //This method serves as the test for seeing how the Slurper functions on a basic level.


        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{ "myList": [4, 8, 15, 16, 23, 42] }')

        assert object instanceof Map
        assert object.myList instanceof List
        assert object.myList == [4, 8, 15, 16, 23, 42]

    }

    static void ToSerialize(){
        def firstField = JsonOutput.toJson([new Field(type : 'select', inputType: null, label: 'TimePoint', model: 'timepointDescription')])

        try {
            FileOutputStream fileOut = new FileOutputStream("fields.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(firstField);
            out.close();
            fileOut.close();
            println "Object firstField serialized."


        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

class Field {
    String type;
    String inputType;
    String label;
    String model;
}
