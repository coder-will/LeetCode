package com.day05;

public class LongestPalindrome {
	
	public String longestPalindrome(String s) {

        int len = s.length();
        while (len > 0) {

            T:
            for (int k = 0; k < s.length() - len + 1; k++) {//���ǵ�ǰ���ȣ��Ӵ���ͬ
            int i = k,j = k+len-1;
                while(i<j) {
                   if(s.charAt(i)==s.charAt(j)){
                        i++;
                        j--;
                   }
                    else continue T;
                    }
                return s.substring(k,k+len);
            }
            len--;//������ȵĶ��Ѿ������ˣ�����һ������
        }

        return s;
    }
}
