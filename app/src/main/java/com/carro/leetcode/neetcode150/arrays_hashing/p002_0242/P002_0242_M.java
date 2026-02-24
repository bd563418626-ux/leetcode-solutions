package com.carro.leetcode.neetcode150.arrays_hashing.p002_0242;

public class P002_0242_M {
    public boolean isAnagram(String s, String t) {
        // 門前払い：長さが違えば、絶対にアナグラムにはなり得ない
        if (s.length() != t.length()) {
            return false;
        }

        // 🧮 頻度カウンタ（a-zの26文字分だけ確保）
        // int[0] は 'a' の数、int[1] は 'b' の数... を表す
        int[] count = new int[26];

        // ワンパス（1回走査）で計測
        for (int i = 0; i < s.length(); i++) {
            // sの文字は「プラス」、tの文字は「マイナス」する
            // char - 'a' で 0〜25 のインデックスに変換（ASCII演算）
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // ⚖️ 審判：すべてのカウンタが「0（釣り合い）」に戻ったか？
        for (int c : count) {
            if (c != 0) {
                return false; // 0じゃない＝数が合わなかった
            }
        }

        return true;
    }
}