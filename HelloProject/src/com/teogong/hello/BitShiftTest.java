package com.teogong.hello;

public class BitShiftTest {
	public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int) Math.pow(2, 3);// 값이 double로 나오기에 정수를 원하면 (int)를 붙인다.
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);

		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);

		int value = 772;// [00000000] [00000000] [00000011] [00000100]

		// 우측으로 3byte(24bit) 이동후 끝 1바이트만 읽음:[00000000]
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;
		System.out.println("첫 번째 바이트 부호 없는값 : " + int1);

		// 우측으로 2byte(16bit) 이동후 끝 1바이트만 읽음:[00000000]
		byte byte2 = (byte) (value >>> 24);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("첫 번째 바이트 부호 없는값 : " + int2);

		// 우측으로 1byte(8bit) 이동후 끝 1바이트만 읽음:[00000011]
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255;
		System.out.println("첫 번째 바이트 부호 없는값 : " + int3);

		//끝 1바이트만 읽음: [00000100]
		byte byte4 = (byte) value;
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.println("첫 번째 바이트 부호 없는값 : " + int4);
	}
}
