package com.example.chanh.dottest;

import java.util.ArrayList;

/**
 * Created by yoonc on 2016-07-28.
 */
public class dot_vowel{
    /*
* 모음 연습에서 사용되는 점자의 배열정보 및 글자정보를 관리하는 클래스
*/
    static public int vowel_count = 42; // 모음 연습의 갯수
    int a[][] = {{1,0},{1,0},{0,1}};//ㅏ
    int ae[][] = {{1,0},{1,1},{1,0}};//ㅐ
    int ja[][] = {{0,1},{0,1},{1,0}};//ㅑ
    int eo[][] = {{0,1},{1,0},{1,0}};//ㅓ
    int e[][] = {{1,1},{0,1},{1,0}};//ㅔ
    int yeo[][] = {{1,0},{0,1},{0,1}};//ㅕ
    int je[][] = {{0,1},{0,0},{1,0}};//ㅖ
    int o[][] = {{1,0},{0,0},{1,1}};//ㅗ
    int wa[][] = {{1,0},{1,0},{1,1}};//ㅘ
    int oi[][] = {{1,1},{0,1},{1,1}};//ㅚ
    int jo[][] = {{0,1},{0,0},{1,1}};//ㅛ
    int u[][] = {{1,1},{0,0},{1,0}};//ㅜ
    int ueo[][] = {{1,1},{1,0},{1,0}};//ㅝ
    int ju[][] = {{1,1},{0,0},{0,1}};//ㅠ
    int ei[][] = {{0,1},{1,0},{0,1}};//ㅡ
    int i[][] = {{1,0},{0,1},{1,0}};//ㅣ
    int ij[][] = {{0,1},{1,1},{0,1}};//ㅢ

    int jae[][] = {{0,1,1,0},{0,1,1,1},{1,0,1,0}};//ㅒ
    int wae[][] = {{1,0,1,0},{1,0,1,1},{1,1,1,0}};//ㅙ
    int we[][] = {{1,1,1,0},{1,0,1,1},{1,0,1,0}};//ㅞ
    int wi[][] = {{1,1,1,0},{0,0,1,1},{1,0,1,0}};//ㅟ

    public int dot_counter[] ={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2}; // 몇개의 칸으로 구성되어 있는지를 나타내는 점자 배열 변수
    public static String name [] ={ "아","애","야","어","에","여","예","오","와","외","요", "우", "워", "유", "으", "의", "이","얘","왜","웨","위",
                                        "ㅏ","ㅐ","ㅑ","ㅓ","ㅔ","ㅕ","ㅖ","ㅗ","ㅘ","ㅚ","ㅛ","ㅜ","ㅝ","ㅠ","ㅡ","ㅢ","ㅣ","ㅒ","ㅙ","ㅞ","ㅟ"};
    public static ArrayList<int[][]> vowel_Array = new ArrayList<>(); // 점자의 배열정보를 저장하는 연결리스트
    public static ArrayList<String> vowel_name = new ArrayList<>(); //점자의 글자를 저장하는 연결리스트
    public static ArrayList<Integer> vowel_dot_count = new ArrayList<>(); // 몇개의 칸으로 구성되어 있는지를 저장하는 연결리스트

    public dot_vowel(){
        vowel_Array.add(a);
        vowel_Array.add(ae);
        vowel_Array.add(ja);
        vowel_Array.add(eo);
        vowel_Array.add(e);
        vowel_Array.add(yeo);
        vowel_Array.add(je);
        vowel_Array.add(o);
        vowel_Array.add(wa);
        vowel_Array.add(oi);
        vowel_Array.add(jo);
        vowel_Array.add(u);
        vowel_Array.add(ueo);
        vowel_Array.add(ju);
        vowel_Array.add(ei);
        vowel_Array.add(ij);
        vowel_Array.add(i);
        vowel_Array.add(jae);
        vowel_Array.add(wae);
        vowel_Array.add(we);
        vowel_Array.add(wi);
        vowel_Array.add(a);
        vowel_Array.add(ae);
        vowel_Array.add(ja);
        vowel_Array.add(eo);
        vowel_Array.add(e);
        vowel_Array.add(yeo);
        vowel_Array.add(je);
        vowel_Array.add(o);
        vowel_Array.add(wa);
        vowel_Array.add(oi);
        vowel_Array.add(jo);
        vowel_Array.add(u);
        vowel_Array.add(ueo);
        vowel_Array.add(ju);
        vowel_Array.add(ei);
        vowel_Array.add(ij);
        vowel_Array.add(i);
        vowel_Array.add(jae);
        vowel_Array.add(wae);
        vowel_Array.add(we);
        vowel_Array.add(wi);


        for(int i = 0 ; i<vowel_count ; i++){
            vowel_name.add(name[i]);
            vowel_dot_count.add(dot_counter[i]);
        }

    }
    public int Dot_count_search(int index){
        int count=0;
        count = vowel_dot_count.get(index);
        return count;
    }

    public int Name_search(String name){
        int index=0;
        boolean check = false;
        for(int i=0; i<vowel_name.size() ; i++){
            if(name.equals(vowel_name.get(i))==true){
                index=i;
                check = true;
                break;
            }
            else
                continue;
        }
        if(check == false)
            index = -1;
        check = false;
        return index;
    }

    public int[][] Matrix_search(int index, int[][] matrix){
        int count = vowel_dot_count.get(index);
        count = count *2;
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<count ; j++){
                matrix[i][j]=vowel_Array.get(index)[i][j];
            }
        }

        return matrix;
    }
}
