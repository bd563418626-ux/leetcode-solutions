package com.carro.leetcode.neetcode150.arrays_hashing.p001_0217;

import java.util.HashSet;
import java.util.Set;

public class P001_0217_M {
    public boolean containsDuplicate(int[] nums) {
        // 📚 歴史書（これまで見た数字を記録する空間）
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            // 🕵️ HashSetの add() は、「すでに要素が存在していた場合」は false を返す
            // わざわざ contains() で確認してから add() するのは、検索を2回行うため無駄よ！
            if (!seen.add(num)) {
                return true; // 追加できなかった＝すでに歴史書にある（重複発見！）
            }
        }
        
        // 配列を最後まで見ても重複がいなければ false
        return false;
    }
}
