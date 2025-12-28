package b1;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3642e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3643a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3644b;

    /* renamed from: c, reason: collision with root package name */
    public int f3645c;

    /* renamed from: d, reason: collision with root package name */
    public char f3646d;

    static {
        for (int i3 = 0; i3 < 1792; i3++) {
            f3642e[i3] = Character.getDirectionality(i3);
        }
    }

    public C0136a(CharSequence charSequence) {
        this.f3643a = charSequence;
        this.f3644b = charSequence.length();
    }

    public final byte a() {
        int i3 = this.f3645c - 1;
        CharSequence charSequence = this.f3643a;
        char charAt = charSequence.charAt(i3);
        this.f3646d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f3645c);
            this.f3645c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f3645c--;
        char c3 = this.f3646d;
        return c3 < 1792 ? f3642e[c3] : Character.getDirectionality(c3);
    }
}
