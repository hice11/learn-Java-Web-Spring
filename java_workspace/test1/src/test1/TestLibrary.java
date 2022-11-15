package test1;

import com.acorn.WON.WonCalculator;
import com.acorn.ch.ChCalculator;
import com.acorn.cheon.cheonCalculator;
import com.acorn.hhw.Hhwcalcul;
import com.acorn.kjw.KjwCalc;
import com.acorn.ksy.KsyCalculator;
import com.acorn.util.CejCalculator;
import com.acorn.util.YhyCalculator;
import com.acorn.yh.yhCalculator;
import com.acron.Jjy.util.JjyCalculator;
import com.acron.Lhj.LhjCalculator;
import com.acron.util.HysCalculator;
import com.corn.bin.BinCalculator;

public class TestLibrary {

	public static void main(String[] args) {
		
		//라이브러리 불러오기
		ChCalculator cal = new ChCalculator();
		double r1 = cal.divideCh(6, 4);
		//static
		double b = ChCalculator.divide(3, 4);

		
		//다른 파일 연습
		//static
		int a = HysCalculator.add(3, 5);
		double c = KjwCalc.divide_kjw(5, 3);
		int cc = KjwCalc.sub_kjw(1, 3);
		int m = WonCalculator.add(3, 5);
		//
		JjyCalculator cal2 = new JjyCalculator();
		int d = cal2.mul(5, 6);
		BinCalculator cal3 = new BinCalculator();
		int e = cal3.sub(3, 5);
		KsyCalculator cal4 = new KsyCalculator();
		int f = cal4.minus(3, 7);
		cheonCalculator cal5 = new cheonCalculator();
		//cal5.division(); //void라 result가 없음
		CejCalculator cal6 = new CejCalculator();
		int g = cal6.sub(3, 9);
		yhCalculator cal7 = new yhCalculator();
		double h = cal7.divide(7, 9);
		Hhwcalcul cal8 = new Hhwcalcul();
		int i = cal8.sub(2, 5);
		LhjCalculator cal9 = new LhjCalculator();
		int j = cal9.sub(1, 5);
		HysCalculator cal10 = new HysCalculator();
		double k = cal10.divide(1, 4);
		int kk = cal10.subtract(1, 4);
		YhyCalculator cal11 = new YhyCalculator();
		int l = cal11.sub(5, 7);
		
		System.out.println(cc);
		System.out.println(r1);	
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(kk);
		System.out.println(l);
		System.out.println(m);
		
	////	
	}
}
