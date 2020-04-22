package File;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
	int number[]=new int[26];
	char count='A';
        for (int i = 0; i <26 ; i++) {
            number[i]=count;
            count++;
            System.out.println(number[i]);
        }
        
    }
}
