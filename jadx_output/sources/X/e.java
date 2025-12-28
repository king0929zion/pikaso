package X;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f2595a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f2596b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f2597c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f2598d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f2599e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f2600f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f2601g;
    public static final r h;

    /* renamed from: i, reason: collision with root package name */
    public static final r f2602i;

    /* renamed from: j, reason: collision with root package name */
    public static final r f2603j;

    /* renamed from: k, reason: collision with root package name */
    public static final r f2604k;

    /* renamed from: l, reason: collision with root package name */
    public static final r f2605l;

    /* renamed from: m, reason: collision with root package name */
    public static final r f2606m;

    /* renamed from: n, reason: collision with root package name */
    public static final r f2607n;

    /* renamed from: o, reason: collision with root package name */
    public static final r f2608o;

    /* renamed from: p, reason: collision with root package name */
    public static final r f2609p;

    /* renamed from: q, reason: collision with root package name */
    public static final l f2610q;

    /* renamed from: r, reason: collision with root package name */
    public static final l f2611r;

    /* renamed from: s, reason: collision with root package name */
    public static final r f2612s;

    /* renamed from: t, reason: collision with root package name */
    public static final m f2613t;

    /* renamed from: u, reason: collision with root package name */
    public static final c[] f2614u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f2595a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f2596b = fArr2;
        s sVar = new s(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        s sVar2 = new s(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        t tVar = k.f2626d;
        r rVar = new r("sRGB IEC61966-2.1", fArr, tVar, sVar, 0);
        f2597c = rVar;
        r rVar2 = new r("sRGB IEC61966-2.1 (Linear)", fArr, tVar, 1.0d, 0.0f, 1.0f, 1);
        f2598d = rVar2;
        r rVar3 = new r("scRGB-nl IEC 61966-2-2:2003", fArr, tVar, null, new d(0), new d(1), -0.799f, 2.399f, sVar, 2);
        f2599e = rVar3;
        r rVar4 = new r("scRGB IEC 61966-2-2:2003", fArr, tVar, 1.0d, -0.5f, 7.499f, 3);
        f2600f = rVar4;
        r rVar5 = new r("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, tVar, new s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f2601g = rVar5;
        r rVar6 = new r("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, tVar, new s(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        h = rVar6;
        r rVar7 = new r("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new t(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f2602i = rVar7;
        r rVar8 = new r("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, tVar, sVar, 7);
        f2603j = rVar8;
        r rVar9 = new r("NTSC (1953)", fArr2, k.f2623a, new s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f2604k = rVar9;
        r rVar10 = new r("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, tVar, new s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f2605l = rVar10;
        r rVar11 = new r("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, tVar, 2.2d, 0.0f, 1.0f, 10);
        f2606m = rVar11;
        r rVar12 = new r("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, k.f2624b, new s(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f2607n = rVar12;
        t tVar2 = k.f2625c;
        r rVar13 = new r("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, tVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f2608o = rVar13;
        r rVar14 = new r("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, tVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f2609p = rVar14;
        l lVar = new l(14, 1, b.f2587b, "Generic XYZ");
        f2610q = lVar;
        long j3 = b.f2588c;
        l lVar2 = new l(15, 0, j3, "Generic L*a*b*");
        f2611r = lVar2;
        r rVar15 = new r("None", fArr, tVar, sVar2, 16);
        f2612s = rVar15;
        m mVar = new m("Oklab", j3, 17);
        f2613t = mVar;
        f2614u = new c[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, rVar14, lVar, lVar2, rVar15, mVar};
    }
}
