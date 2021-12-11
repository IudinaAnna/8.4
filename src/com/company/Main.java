package com.company;
import java.util.Scanner;
import java.lang.Math;
class Rectanagle {
    private  float length;
    private  float width;
    public Rectanagle(float length, float width) {
        if(length>0.0 && length<20.0)
            this.length=length;
        if(width>0.0 && width<20.0)
            this.width=length;
    }
    public void setLentgh(float length) {
        this.length=length;
        if(length<=0)
        {
            length=1;
        }
    }
    public float getLength()
    {
        return length;
    }
    public void setWidtgh(float width) {
        this.width=width;
        if(width<=0)
        {
            width=1;
        }
    }
    public float getWidth()
    {
        return width;
    }
    public float Area(float length,float width) {
        float area=0;
        if(length>0.0 && length<20.0 && width>0.0 && width<20.0)
            area=width*length;
        else System.out.println("Ошибка при вводе значений!");
        return area;
    }
    public float Perimetr(float length,float width) {
        float per=0;
        if(length>0.0 && length<20.0 && width>0.0 && width<20.0)
            per=2*(width+length);
        else System.out.println("Ошибка при вводе значений!");
        return per;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Длина: ");
        float a=input.nextFloat();
        System.out.print("Ширина: ");
        float b=input.nextFloat();
        Rectanagle rec=new Rectanagle(a,b);
        System.out.println("Площадь прямоугольника: "+  rec.Area(a,b));
        System.out.println("Периметр прямоугольника: "+rec.Perimetr(a,b));
    }
}
