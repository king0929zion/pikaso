package A;

import D.C0032d;

/* renamed from: A.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0000a {
    public static int a(int i3, int i4, int i5) {
        return (Integer.hashCode(i3) + i4) * i5;
    }

    public static int b(int i3, int i4, long j3) {
        return (Long.hashCode(j3) + i3) * i4;
    }

    public static String c(String str, int i3) {
        return str + i3;
    }

    public static String d(String str, int i3, String str2, int i4) {
        return str + i3 + str2 + i4;
    }

    public static String e(String str, String str2) {
        return str + str2;
    }

    public static String f(StringBuilder sb, float f3, char c3) {
        sb.append(f3);
        sb.append(c3);
        return sb.toString();
    }

    public static StringBuilder g(String str, String str2) {
        p2.g.d(str, str2);
        return new StringBuilder();
    }

    public static void h(int i3, int i4, int i5, int i6, int i7) {
        Z.b.a(i3);
        Z.b.a(i4);
        Z.b.a(i5);
        Z.b.a(i6);
        Z.b.a(i7);
    }

    public static void i(long j3, StringBuilder sb, String str) {
        sb.append((Object) W.r.i(j3));
        sb.append(str);
    }

    public static /* synthetic */ void j(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void k(StringBuilder sb, int i3, String str, String str2, String str3) {
        sb.append(i3);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void l(StringBuilder sb, int i3, String str, String str2, String str3) {
        sb.append(i3);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        C0032d.I(sb.toString());
        throw null;
    }

    public static /* synthetic */ String m(int i3) {
        switch (i3) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String n(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? "null" : "Idle" : "LookaheadLayingOut" : "LayingOut" : "LookaheadMeasuring" : "Measuring";
    }
}
