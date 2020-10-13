package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// - Domainclass  to contain Data from fetch 
// - Consuming a RESTful service 

/*
Response looks like : 
{
   type: "success",
   value: {
      id: 10,
      quote: "Really loving Spring Boot, makes stand alone Spring apps easy."
   }
} 
*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

        private String type;
        private String value;

        public Quote(){
            // Do nothing
        }

        public String getType(){
            return this.type;
        }

        public void setType(String type){
            this.type = type;
        }

        public String getValue(){
            return this.value;
        }

        public void setValue(String value){
            this.value = value;
        }

        @Override
        public String toString(){
            return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}'; 
        }

}
