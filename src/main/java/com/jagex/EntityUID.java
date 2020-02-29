package com.jagex;

import java.awt.*;

public class EntityUID {
    public static byte[][][] aByteArrayArrayArray547;
    static Image anImage546;
    static long aLong548;

    public static int getHoveredObjectType(int var0) {
        return getObjectType(Statics2.onCursorUids[var0]);
    }

    public static int getHoveredObjectSceneY(int var0) {
        return getObjectSceneY(Statics2.onCursorUids[var0]);
    }

    public static int getObjectId(long var0) {
        return (int) (var0 >>> 17 & 0xffffffffL);
    }

    public static int getObjectSceneX(long var0) {
        return (int) (var0 & 0x7fL);
    }

    static int getObjectType(long var0) {
        return (int) (var0 >>> 14 & 0x3L);
    }

    public static int getObjectSceneY(long var0) {
        return (int) (var0 >>> 7 & 0x7fL);
    }

    public static long build(int var0, int var1, int var2, boolean var3, int var4) {
        long var5 = (long) ((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long) var4 & 4294967295L) << 17;
        if (var3) {
            var5 |= 65536L;
        }

        return var5;
    }
}