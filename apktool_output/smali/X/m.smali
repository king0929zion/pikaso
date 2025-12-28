.class public final LX/m;
.super LX/c;
.source "SourceFile"


# static fields
.field public static final d:[F

.field public static final e:[F

.field public static final f:[F

.field public static final g:[F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    const/16 v1, 0x9

    new-array v2, v1, [F

    fill-array-data v2, :array_0

    sget-object v3, LX/a;->b:LX/a;

    new-array v4, v0, [F

    fill-array-data v4, :array_1

    new-array v0, v0, [F

    fill-array-data v0, :array_2

    iget-object v3, v3, LX/a;->a:[F

    invoke-static {v3, v4, v0}, LX/k;->c([F[F[F)[F

    move-result-object v0

    invoke-static {v2, v0}, LX/k;->h([F[F)[F

    move-result-object v0

    sput-object v0, LX/m;->d:[F

    new-array v1, v1, [F

    fill-array-data v1, :array_3

    sput-object v1, LX/m;->e:[F

    invoke-static {v0}, LX/k;->g([F)[F

    move-result-object v0

    sput-object v0, LX/m;->f:[F

    invoke-static {v1}, LX/k;->g([F)[F

    move-result-object v0

    sput-object v0, LX/m;->g:[F

    return-void

    :array_0
    .array-data 4
        0x3f51a598
        0x3d071acd
        0x3d456dae
        0x3eb94699
        0x3f6de762
        0x3e875b04
        -0x41fc0c33
        0x3d140d73
        0x3f22441b
    .end array-data

    :array_1
    .array-data 4
        0x3f76d699    # 0.964212f
        0x3f800000    # 1.0f
        0x3f533f8a
    .end array-data

    :array_2
    .array-data 4
        0x3f734f49
        0x3f800000    # 1.0f
        0x3f8b6117
    .end array-data

    :array_3
    .array-data 4
        0x3e578152
        0x3ffd2f0e
        0x3cd434b4
        0x3f4b2a89
        -0x3fe491f2
        0x3f4863bb
        -0x447a9132
        0x3ee6b438
        -0x40b0faa0
    .end array-data
.end method


# virtual methods
.method public final a(I)F
    .locals 0

    if-nez p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f000000    # 0.5f

    :goto_0
    return p1
.end method

.method public final b(I)F
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/high16 p1, -0x41000000    # -0.5f

    :goto_0
    return p1
.end method

.method public final d(FFF)J
    .locals 10

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_1

    move p1, v0

    :cond_1
    const/high16 v0, -0x41000000    # -0.5f

    cmpg-float v1, p2, v0

    if-gez v1, :cond_2

    move p2, v0

    :cond_2
    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v2, p2, v1

    if-lez v2, :cond_3

    move p2, v1

    :cond_3
    cmpg-float v2, p3, v0

    if-gez v2, :cond_4

    move p3, v0

    :cond_4
    cmpl-float v0, p3, v1

    if-lez v0, :cond_5

    goto :goto_0

    :cond_5
    move v1, p3

    :goto_0
    sget-object p3, LX/m;->g:[F

    const/4 v0, 0x0

    aget v2, p3, v0

    mul-float/2addr v2, p1

    const/4 v3, 0x3

    aget v4, p3, v3

    mul-float/2addr v4, p2

    add-float/2addr v4, v2

    const/4 v2, 0x6

    aget v5, p3, v2

    mul-float/2addr v5, v1

    add-float/2addr v5, v4

    const/4 v4, 0x1

    aget v6, p3, v4

    mul-float/2addr v6, p1

    const/4 v7, 0x4

    aget v8, p3, v7

    mul-float/2addr v8, p2

    add-float/2addr v8, v6

    const/4 v6, 0x7

    aget v9, p3, v6

    mul-float/2addr v9, v1

    add-float/2addr v9, v8

    const/4 v8, 0x2

    aget v8, p3, v8

    mul-float/2addr v8, p1

    const/4 p1, 0x5

    aget p1, p3, p1

    mul-float/2addr p1, p2

    add-float/2addr p1, v8

    const/16 p2, 0x8

    aget p2, p3, p2

    mul-float/2addr p2, v1

    add-float/2addr p2, p1

    mul-float p1, v5, v5

    mul-float/2addr p1, v5

    mul-float p3, v9, v9

    mul-float/2addr p3, v9

    mul-float v1, p2, p2

    mul-float/2addr v1, p2

    sget-object p2, LX/m;->f:[F

    aget v0, p2, v0

    mul-float/2addr v0, p1

    aget v3, p2, v3

    mul-float/2addr v3, p3

    add-float/2addr v3, v0

    aget v0, p2, v2

    mul-float/2addr v0, v1

    add-float/2addr v0, v3

    aget v2, p2, v4

    mul-float/2addr v2, p1

    aget p1, p2, v7

    mul-float/2addr p1, p3

    add-float/2addr p1, v2

    aget p2, p2, v6

    mul-float/2addr p2, v1

    add-float/2addr p2, p1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v0, p1

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    const/16 p3, 0x20

    shl-long/2addr v0, p3

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    or-long/2addr p1, v0

    return-wide p1
.end method

.method public final e(FFF)F
    .locals 6

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_1

    move p1, v0

    :cond_1
    const/high16 v0, -0x41000000    # -0.5f

    cmpg-float v1, p2, v0

    if-gez v1, :cond_2

    move p2, v0

    :cond_2
    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v2, p2, v1

    if-lez v2, :cond_3

    move p2, v1

    :cond_3
    cmpg-float v2, p3, v0

    if-gez v2, :cond_4

    move p3, v0

    :cond_4
    cmpl-float v0, p3, v1

    if-lez v0, :cond_5

    goto :goto_0

    :cond_5
    move v1, p3

    :goto_0
    const/4 p3, 0x0

    sget-object v0, LX/m;->g:[F

    aget p3, v0, p3

    mul-float/2addr p3, p1

    const/4 v2, 0x3

    aget v2, v0, v2

    mul-float/2addr v2, p2

    add-float/2addr v2, p3

    const/4 p3, 0x6

    aget p3, v0, p3

    mul-float/2addr p3, v1

    add-float/2addr p3, v2

    const/4 v2, 0x1

    aget v2, v0, v2

    mul-float/2addr v2, p1

    const/4 v3, 0x4

    aget v3, v0, v3

    mul-float/2addr v3, p2

    add-float/2addr v3, v2

    const/4 v2, 0x7

    aget v2, v0, v2

    mul-float/2addr v2, v1

    add-float/2addr v2, v3

    const/4 v3, 0x2

    aget v4, v0, v3

    mul-float/2addr v4, p1

    const/4 p1, 0x5

    aget v5, v0, p1

    mul-float/2addr v5, p2

    add-float/2addr v5, v4

    const/16 p2, 0x8

    aget v0, v0, p2

    mul-float/2addr v0, v1

    add-float/2addr v0, v5

    mul-float v1, p3, p3

    mul-float/2addr v1, p3

    mul-float p3, v2, v2

    mul-float/2addr p3, v2

    mul-float v2, v0, v0

    mul-float/2addr v2, v0

    sget-object v0, LX/m;->f:[F

    aget v3, v0, v3

    mul-float/2addr v3, v1

    aget p1, v0, p1

    mul-float/2addr p1, p3

    add-float/2addr p1, v3

    aget p2, v0, p2

    mul-float/2addr p2, v2

    add-float/2addr p2, p1

    return p2
.end method

.method public final f(FFFFLX/c;)J
    .locals 13

    sget-object v0, LX/m;->d:[F

    const/4 v1, 0x0

    aget v2, v0, v1

    mul-float/2addr v2, p1

    const/4 v3, 0x3

    aget v4, v0, v3

    mul-float/2addr v4, p2

    add-float/2addr v4, v2

    const/4 v2, 0x6

    aget v5, v0, v2

    mul-float v5, v5, p3

    add-float/2addr v5, v4

    const/4 v4, 0x1

    aget v6, v0, v4

    mul-float/2addr v6, p1

    const/4 v7, 0x4

    aget v8, v0, v7

    mul-float/2addr v8, p2

    add-float/2addr v8, v6

    const/4 v6, 0x7

    aget v9, v0, v6

    mul-float v9, v9, p3

    add-float/2addr v9, v8

    const/4 v8, 0x2

    aget v10, v0, v8

    mul-float/2addr v10, p1

    const/4 v11, 0x5

    aget v12, v0, v11

    mul-float/2addr v12, p2

    add-float/2addr v12, v10

    const/16 v10, 0x8

    aget v0, v0, v10

    mul-float v0, v0, p3

    add-float/2addr v0, v12

    invoke-static {v5}, Lr2/a;->w(F)F

    move-result v5

    invoke-static {v9}, Lr2/a;->w(F)F

    move-result v9

    invoke-static {v0}, Lr2/a;->w(F)F

    move-result v0

    sget-object v12, LX/m;->e:[F

    aget v1, v12, v1

    mul-float/2addr v1, v5

    aget v3, v12, v3

    mul-float/2addr v3, v9

    add-float/2addr v3, v1

    aget v1, v12, v2

    mul-float/2addr v1, v0

    add-float/2addr v1, v3

    aget v2, v12, v4

    mul-float/2addr v2, v5

    aget v3, v12, v7

    mul-float/2addr v3, v9

    add-float/2addr v3, v2

    aget v2, v12, v6

    mul-float/2addr v2, v0

    add-float/2addr v2, v3

    aget v3, v12, v8

    mul-float/2addr v3, v5

    aget v4, v12, v11

    mul-float/2addr v4, v9

    add-float/2addr v4, v3

    aget v3, v12, v10

    mul-float/2addr v3, v0

    add-float/2addr v3, v4

    move/from16 v0, p4

    move-object/from16 v4, p5

    invoke-static {v1, v2, v3, v0, v4}, LW/D;->a(FFFFLX/c;)J

    move-result-wide v0

    return-wide v0
.end method
