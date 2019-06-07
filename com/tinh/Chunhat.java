package com.tinh;

class Chunhat {
    double whith,height;
    Chunhat(double whith,double height){
        this.whith=whith;
        this.height=height;
    }
    double getArea(){
        return (this.height*this.whith);
    }
    double getPerimeter(){
        return (this.height+this.whith)*2;
    }
    String display(){
        return  "Rectangle{"+"width= "+ whith+" height= "+height+"}";
    }
}
