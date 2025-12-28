package b1;

import android.text.SpannableStringBuilder;

/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f3647b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f3648c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0137b f3649d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0137b f3650e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3651a;

    static {
        M1.d dVar = f.f3659c;
        f3647b = Character.toString((char) 8206);
        f3648c = Character.toString((char) 8207);
        f3649d = new C0137b(false);
        f3650e = new C0137b(true);
    }

    public C0137b(boolean z3) {
        M1.d dVar = f.f3657a;
        this.f3651a = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0073, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0079, code lost:
    
        if (r0.f3645c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0083, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0086, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0089, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008c, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            b1.a r0 = new b1.a
            r0.<init>(r9)
            r9 = 0
            r0.f3645c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.f3645c
            int r5 = r0.f3644b
            r6 = 1
            r7 = -1
            if (r4 >= r5) goto L70
            if (r1 != 0) goto L70
            java.lang.CharSequence r5 = r0.f3643a
            char r4 = r5.charAt(r4)
            r0.f3646d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f3645c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f3645c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f3645c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f3645c
            int r4 = r4 + r6
            r0.f3645c = r4
            char r4 = r0.f3646d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = b1.C0136a.f3642e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L6a
            if (r4 == r6) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6e
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L66:
            if (r3 != 0) goto L6e
        L68:
            r9 = r6
            goto L8f
        L6a:
            if (r3 != 0) goto L6e
        L6c:
            r9 = r7
            goto L8f
        L6e:
            r1 = r3
            goto Lb
        L70:
            if (r1 != 0) goto L73
            goto L8f
        L73:
            if (r2 == 0) goto L77
            r9 = r2
            goto L8f
        L77:
            int r2 = r0.f3645c
            if (r2 <= 0) goto L8f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L8c;
                case 15: goto L8c;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r3 = r3 + 1
            goto L77
        L86:
            if (r1 != r3) goto L89
            goto L68
        L89:
            int r3 = r3 + (-1)
            goto L77
        L8c:
            if (r1 != r3) goto L89
            goto L6c
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0137b.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.CharSequence r7) {
        /*
            b1.a r0 = new b1.a
            r0.<init>(r7)
            int r7 = r0.f3644b
            r0.f3645c = r7
            r7 = 0
            r1 = r7
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.f3645c
            if (r3 <= 0) goto L41
            byte r3 = r0.a()
            r4 = -1
            if (r3 == 0) goto L3b
            r5 = 1
            if (r3 == r5) goto L35
            r6 = 2
            if (r3 == r6) goto L35
            r6 = 9
            if (r3 == r6) goto Lc
            switch(r3) {
                case 14: goto L31;
                case 15: goto L31;
                case 16: goto L2a;
                case 17: goto L2a;
                case 18: goto L27;
                default: goto L24;
            }
        L24:
            if (r2 != 0) goto Lc
            goto L40
        L27:
            int r1 = r1 + 1
            goto Lc
        L2a:
            if (r2 != r1) goto L2e
        L2c:
            r7 = r5
            goto L41
        L2e:
            int r1 = r1 + (-1)
            goto Lc
        L31:
            if (r2 != r1) goto L2e
        L33:
            r7 = r4
            goto L41
        L35:
            if (r1 != 0) goto L38
            goto L2c
        L38:
            if (r2 != 0) goto Lc
            goto L40
        L3b:
            if (r1 != 0) goto L3e
            goto L33
        L3e:
            if (r2 != 0) goto Lc
        L40:
            goto Lb
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0137b.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        M1.d dVar = f.f3659c;
        if (charSequence == null) {
            return null;
        }
        boolean b3 = dVar.b(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean b4 = (b3 ? f.f3658b : f.f3657a).b(charSequence.length(), charSequence);
        String str = "";
        String str2 = f3648c;
        String str3 = f3647b;
        boolean z3 = this.f3651a;
        spannableStringBuilder.append((CharSequence) ((z3 || !(b4 || a(charSequence) == 1)) ? (!z3 || (b4 && a(charSequence) != -1)) ? "" : str2 : str3));
        if (b3 != z3) {
            spannableStringBuilder.append(b3 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b5 = (b3 ? f.f3658b : f.f3657a).b(charSequence.length(), charSequence);
        if (!z3 && (b5 || b(charSequence) == 1)) {
            str = str3;
        } else if (z3 && (!b5 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
