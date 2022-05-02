package jp.co.aforce.sample;

//継承の使用方法
//本プログラムはmain()実行時Cが呼び出されるが、
//Cの継承元のBが呼び出され、
//Bの継承元のAが呼び出される
//実行順でたどるとA,B,Cの順で実行される
public class UseExtends {

	static class A {
		public A() {
			System.out.println("A");
		}
	}

	static class B extends A {
		public B() {
			System.out.println("B");
		}
	}

	static class C extends B {
		public C() {
			System.out.println("C");
		}
	}

	public static void main(String args[]) {

		new C(); //ABCの順番で実行される

	}

}
