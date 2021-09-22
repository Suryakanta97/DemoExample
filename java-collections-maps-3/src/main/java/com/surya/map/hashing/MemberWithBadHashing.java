package com.surya.map.hashing;

public class MemberWithBadHashing extends Member {
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
