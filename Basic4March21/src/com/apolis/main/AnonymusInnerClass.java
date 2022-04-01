package com.apolis.main;

interface AnonymusInnerClass {

	
		void method();
		}

		class Temp{
		public static void main(String[] s){
		AnonymusInnerClass object = new AnonymusInnerClass(){
			
			@Override
			public void method() {
			      System.out.println("method : anonymous class");
		 }
		};
		object.method();
		}
		}
