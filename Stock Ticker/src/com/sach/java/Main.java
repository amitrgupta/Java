//package com.sach.java;

import java.nio.charset.Charset;
import java.util.*;



public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");

        int i=0;
        String str="Try";

        System.out.println("The string is " +str +" the number is: "+ i);

        int[] arrayOfIntegers =new int[4];
        arrayOfIntegers[0]=1;
        arrayOfIntegers[1]=-1;
        arrayOfIntegers[2]=2;
        arrayOfIntegers[3]=-2;

        String[] arrayOfStrings ={"Humble","Pie","Eats", "Dumble"};



        for(int a:arrayOfIntegers){
            System.out.println("The number is: " + a);
        }

        for (String s:arrayOfStrings){
            System.out.print(s + " ");
        }

  //      Ag[] empRecord= new Ag[2];

//        for(Ag emp:empRecord){
//
//            emp.setEmployeeId(ran.nextInt());
//            emp.setEmployeeName(new String(array, Charset.forName("UTF-8")));
//        }
//
//
//        for(Ag empn:empRecord){
//
//            System.out.println(empn.getEmployeeId());
//            System.out.println(empn.getEmployeeName());
//        }


        List<Integer> listOfIntegers=new ArrayList<>();
        List<String> listOfString=new ArrayList<>();

        for (int y=0; y<arrayOfIntegers.length; y++){
            listOfIntegers.add(arrayOfIntegers[y]);
            listOfString.add(arrayOfStrings[y]);

        }

        for(int z = 0; z<listOfIntegers.size(); z++){

            System.out.println(listOfIntegers.get(z));
            System.out.println(listOfString.get(z));
        }


        Map<String,Integer> mapOfStringIntPairs=new HashMap<>();

        for( int j=0; j<arrayOfStrings.length; j++){

            mapOfStringIntPairs.put(arrayOfStrings[j],arrayOfIntegers[j]);

        }


        String someKey="Pie";
        if(mapOfStringIntPairs.containsKey(someKey)){
            System.out.println("Key="+someKey + " " +
                    "is in the map and the corresponding value is : " + mapOfStringIntPairs.get(someKey));
        }
        else{

            System.out.println("Key does not exist in the map");
        }


        for(String k:mapOfStringIntPairs.keySet()){

            System.out.println("The Key is " + k + " and the value is " + mapOfStringIntPairs.get(k));


        }


    }

    class Ag
    {
        int employeeId=0;
        String employeeName="";

        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public String getEmployeeName() {
            return employeeName;
        }
    }
}
