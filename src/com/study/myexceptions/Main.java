package com.study.myexceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.System.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.study.mygeneric.MyList;

public class Main {

	public static void File() {
		File f = new File("Demo.text");
		try (FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);) {
			MyList<Integer> list = new MyList<>();

			for (int i = 0; i < 5; i++) {
				list.add(i);
			}

			for (int i = 0; i < 5; i++) {
				bw.write("This is " + i + " = " + list.get(i));
				System.out.println(list.get(i));
				bw.newLine();
			}
			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println(f.getAbsolutePath());
		} catch (Exception e) {
			System.out.println("this For File " + e.toString());
		}
	}

	public static void MidClass() {
		try {
			MidClass md = new MidClass();
			System.out.println(md.IntegerDiviston(20, 10));
			System.out.println(md.FloatDivition(20, 20));
			System.out.println(md.DoubleDivistion(200, 2));
		} catch (ArithmeticException | UserExceptions e) {
			System.out.println("This Main Class " + e.toString());
			StackTraceElement arr[] = e.getStackTrace();
			for (int i = 0; i < arr.length; i++) {
				System.err.println(arr[i].getClassName() + " " + arr[i].getMethodName());
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a Value:");
			int a = sc.nextInt();

			MyList<Integer> l = new MyList<>();
			l.add(20);
			l.add(null);
			// l.get(2).intValue();
			int b = l.get(0).intValue();
			try {
				ClassForThrows cft = new ClassForThrows();
				System.out.println("Integer Divistion :" + cft.div(b, a));
				System.out.println("Float Divistion" + cft.divFloat(b, a));
			} catch (ArithmeticException e) {
				System.out.println(e.toString());
			}
		} catch (InputMismatchException e) {
			System.out.println(e.toString());
		} catch (NullPointerException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			sc.close();
			System.out.println("This is finnaly block");
		}
		MidClass();
		// File();
	}

}
