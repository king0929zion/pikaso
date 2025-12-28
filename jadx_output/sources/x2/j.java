package x2;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import x.AbstractC0637b;

/* loaded from: classes.dex */
public abstract class j extends h {
    public static final int g(CharSequence charSequence) {
        p2.g.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int h(CharSequence charSequence, String str, int i3, boolean z3) {
        p2.g.e(charSequence, "<this>");
        p2.g.e(str, "string");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i3);
        }
        int length = charSequence.length();
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        u2.d dVar = new u2.d(i3, length, 1);
        boolean z4 = charSequence instanceof String;
        int i4 = dVar.f6302f;
        int i5 = dVar.f6301e;
        int i6 = dVar.f6300d;
        if (!z4 || str == null) {
            if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
                while (!m(str, 0, charSequence, i6, str.length(), z3)) {
                    if (i6 != i5) {
                        i6 += i4;
                    }
                }
                return i6;
            }
            return -1;
        }
        if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
            while (!l(0, i6, str.length(), str, (String) charSequence, z3)) {
                if (i6 != i5) {
                    i6 += i4;
                }
            }
            return i6;
        }
        return -1;
    }

    public static int i(CharSequence charSequence, char c3, int i3, boolean z3, int i4) {
        int i5;
        char upperCase;
        char upperCase2;
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        p2.g.e(charSequence, "<this>");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c3, i3);
        }
        char[] cArr = {c3};
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(cArr[0], i3);
        }
        if (i3 < 0) {
            i3 = 0;
        }
        int i6 = new u2.d(i3, g(charSequence), 1).f6301e;
        boolean z4 = i3 <= i6;
        if (!z4) {
            i3 = i6;
        }
        while (z4) {
            if (i3 != i6) {
                i5 = i3 + 1;
            } else {
                if (!z4) {
                    throw new NoSuchElementException();
                }
                i5 = i3;
                z4 = false;
            }
            char charAt = charSequence.charAt(i3);
            char c4 = cArr[0];
            if (c4 == charAt || (z3 && ((upperCase = Character.toUpperCase(c4)) == (upperCase2 = Character.toUpperCase(charAt)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                return i3;
            }
            i3 = i5;
        }
        return -1;
    }

    public static /* synthetic */ int j(CharSequence charSequence, String str, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return h(charSequence, str, i3, false);
    }

    public static final boolean k(String str) {
        p2.g.e(str, "<this>");
        if (str.length() == 0) {
            return true;
        }
        Iterable dVar = new u2.d(0, str.length() - 1, 1);
        if ((dVar instanceof Collection) && ((Collection) dVar).isEmpty()) {
            return true;
        }
        Iterator it = dVar.iterator();
        while (((u2.c) it).f6305f) {
            if (!AbstractC0637b.c(str.charAt(((u2.c) it).a()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean l(int i3, int i4, int i5, String str, String str2, boolean z3) {
        p2.g.e(str, "<this>");
        p2.g.e(str2, "other");
        return !z3 ? str.regionMatches(i3, str2, i4, i5) : str.regionMatches(z3, i3, str2, i4, i5);
    }

    public static final boolean m(CharSequence charSequence, int i3, CharSequence charSequence2, int i4, int i5, boolean z3) {
        char upperCase;
        char upperCase2;
        p2.g.e(charSequence, "<this>");
        p2.g.e(charSequence2, "other");
        if (i4 < 0 || i3 < 0 || i3 > charSequence.length() - i5 || i4 > charSequence2.length() - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            char charAt = charSequence.charAt(i3 + i6);
            char charAt2 = charSequence2.charAt(i4 + i6);
            if (charAt != charAt2 && (!z3 || ((upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                return false;
            }
        }
        return true;
    }

    public static String n(String str, String str2) {
        p2.g.e(str2, "delimiter");
        int j3 = j(str, str2, 0, 6);
        if (j3 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + j3, str.length());
        p2.g.d(substring, "substring(...)");
        return substring;
    }

    public static String o(String str) {
        p2.g.e(str, "<this>");
        p2.g.e(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, g(str));
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        p2.g.d(substring, "substring(...)");
        return substring;
    }
}
