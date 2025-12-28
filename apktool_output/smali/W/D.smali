.class public abstract LW/D;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LX1/e;

.field public static b:Ljava/lang/reflect/Method;

.field public static c:Ljava/lang/reflect/Method;

.field public static d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX1/e;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, LX1/e;-><init>(I)V

    sput-object v0, LW/D;->a:LX1/e;

    return-void
.end method

.method public static final A(I)Landroid/graphics/BlendMode;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LC1/a;->d()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LC1/a;->v()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_1
    const/4 v0, 0x2

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LC1/a;->r()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_2
    const/4 v0, 0x3

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LC1/a;->q()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_3
    const/4 v0, 0x4

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LC1/a;->s()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_4
    const/4 v0, 0x5

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LC1/a;->t()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_5
    const/4 v0, 0x6

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, LW/a;->d()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_6
    const/4 v0, 0x7

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LW/a;->p()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_7
    const/16 v0, 0x8

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LW/a;->v()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_8
    const/16 v0, 0x9

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LW/a;->x()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_9
    const/16 v0, 0xa

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LC1/a;->o()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_a
    const/16 v0, 0xb

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LW/a;->y()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_b
    const/16 v0, 0xc

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LW/a;->z()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_c
    const/16 v0, 0xd

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LW/a;->A()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_d
    const/16 v0, 0xe

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LW/a;->B()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_e
    const/16 v0, 0xf

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LW/a;->C()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_f
    const/16 v0, 0x10

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LW/a;->D()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_10
    const/16 v0, 0x11

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LW/a;->t()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_11
    const/16 v0, 0x12

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LW/a;->u()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_12
    const/16 v0, 0x13

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {}, LC1/a;->m()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_13
    const/16 v0, 0x14

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {}, LC1/a;->x()Landroid/graphics/BlendMode;

    move-result-object p0

    goto/16 :goto_0

    :cond_14
    const/16 v0, 0x15

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LC1/a;->y()Landroid/graphics/BlendMode;

    move-result-object p0

    goto :goto_0

    :cond_15
    const/16 v0, 0x16

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LC1/a;->z()Landroid/graphics/BlendMode;

    move-result-object p0

    goto :goto_0

    :cond_16
    const/16 v0, 0x17

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, LC1/a;->A()Landroid/graphics/BlendMode;

    move-result-object p0

    goto :goto_0

    :cond_17
    const/16 v0, 0x18

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, LC1/a;->B()Landroid/graphics/BlendMode;

    move-result-object p0

    goto :goto_0

    :cond_18
    const/16 v0, 0x19

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, LC1/a;->C()Landroid/graphics/BlendMode;

    move-result-object p0

    goto :goto_0

    :cond_19
    const/16 v0, 0x1a

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-static {}, LC1/a;->D()Landroid/graphics/BlendMode;

    move-result-object p0

    goto :goto_0

    :cond_1a
    const/16 v0, 0x1b

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {}, LC1/a;->n()Landroid/graphics/BlendMode;

    move-result-object p0

    goto :goto_0

    :cond_1b
    const/16 v0, 0x1c

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result p0

    if-eqz p0, :cond_1c

    invoke-static {}, LC1/a;->p()Landroid/graphics/BlendMode;

    move-result-object p0

    goto :goto_0

    :cond_1c
    invoke-static {}, LC1/a;->q()Landroid/graphics/BlendMode;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final B(LV/d;)Landroid/graphics/Rect;
    .locals 4

    new-instance v0, Landroid/graphics/Rect;

    iget v1, p0, LV/d;->a:F

    float-to-int v1, v1

    iget v2, p0, LV/d;->b:F

    float-to-int v2, v2

    iget v3, p0, LV/d;->c:F

    float-to-int v3, v3

    iget p0, p0, LV/d;->d:F

    float-to-int p0, p0

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public static final C(J)I
    .locals 1

    sget-object v0, LX/e;->a:[F

    sget-object v0, LX/e;->c:LX/r;

    invoke-static {p0, p1, v0}, LW/r;->a(JLX/c;)J

    move-result-wide p0

    const/16 v0, 0x20

    ushr-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method

.method public static final D(I)Landroid/graphics/Bitmap$Config;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, LW/D;->o(II)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p0, v0}, LW/D;->o(II)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    invoke-static {p0, v0}, LW/D;->o(II)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_2
    const/4 v0, 0x3

    invoke-static {p0, v0}, LW/D;->o(II)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Landroid/graphics/Bitmap$Config;->RGBA_F16:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_3
    const/4 v0, 0x4

    invoke-static {p0, v0}, LW/D;->o(II)Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_4
    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :goto_0
    return-object p0
.end method

.method public static final E(I)Landroid/graphics/PorterDuff$Mode;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    goto/16 :goto_0

    :cond_1
    const/4 v0, 0x2

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST:Landroid/graphics/PorterDuff$Mode;

    goto/16 :goto_0

    :cond_2
    const/4 v0, 0x3

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    goto/16 :goto_0

    :cond_3
    const/4 v0, 0x4

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    goto/16 :goto_0

    :cond_4
    const/4 v0, 0x5

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    goto/16 :goto_0

    :cond_5
    const/4 v0, 0x6

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    goto/16 :goto_0

    :cond_6
    const/4 v0, 0x7

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OUT:Landroid/graphics/PorterDuff$Mode;

    goto/16 :goto_0

    :cond_7
    const/16 v0, 0x8

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    goto/16 :goto_0

    :cond_8
    const/16 v0, 0x9

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_9
    const/16 v0, 0xa

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_ATOP:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_a
    const/16 v0, 0xb

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->XOR:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_b
    const/16 v0, 0xc

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_c
    const/16 v0, 0xe

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_d
    const/16 v0, 0xf

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->OVERLAY:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_e
    const/16 v0, 0x10

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DARKEN:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_f
    const/16 v0, 0x11

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_10

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->LIGHTEN:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_10
    const/16 v0, 0xd

    invoke-static {p0, v0}, LW/D;->l(II)Z

    move-result p0

    if-eqz p0, :cond_11

    sget-object p0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_11
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    :goto_0
    return-object p0
.end method

.method public static F([FFF)V
    .locals 8

    const/4 v0, 0x0

    aget v0, p0, v0

    mul-float/2addr v0, p1

    const/4 v1, 0x4

    aget v1, p0, v1

    mul-float/2addr v1, p2

    add-float/2addr v1, v0

    const/16 v0, 0x8

    aget v0, p0, v0

    const/4 v2, 0x0

    mul-float/2addr v0, v2

    add-float/2addr v0, v1

    const/16 v1, 0xc

    aget v3, p0, v1

    add-float/2addr v0, v3

    const/4 v3, 0x1

    aget v3, p0, v3

    mul-float/2addr v3, p1

    const/4 v4, 0x5

    aget v4, p0, v4

    mul-float/2addr v4, p2

    add-float/2addr v4, v3

    const/16 v3, 0x9

    aget v3, p0, v3

    mul-float/2addr v3, v2

    add-float/2addr v3, v4

    const/16 v4, 0xd

    aget v5, p0, v4

    add-float/2addr v3, v5

    const/4 v5, 0x2

    aget v5, p0, v5

    mul-float/2addr v5, p1

    const/4 v6, 0x6

    aget v6, p0, v6

    mul-float/2addr v6, p2

    add-float/2addr v6, v5

    const/16 v5, 0xa

    aget v5, p0, v5

    mul-float/2addr v5, v2

    add-float/2addr v5, v6

    const/16 v6, 0xe

    aget v7, p0, v6

    add-float/2addr v5, v7

    const/4 v7, 0x3

    aget v7, p0, v7

    mul-float/2addr v7, p1

    const/4 p1, 0x7

    aget p1, p0, p1

    mul-float/2addr p1, p2

    add-float/2addr p1, v7

    const/16 p2, 0xb

    aget p2, p0, p2

    mul-float/2addr p2, v2

    add-float/2addr p2, p1

    const/16 p1, 0xf

    aget v2, p0, p1

    add-float/2addr p2, v2

    aput v0, p0, v1

    aput v3, p0, v4

    aput v5, p0, v6

    aput p2, p0, p1

    return-void
.end method

.method public static final G(F[FI)I
    .locals 3

    const/4 v0, 0x0

    cmpg-float v1, p0, v0

    const/high16 v2, 0x7fc00000    # Float.NaN

    if-gez v1, :cond_1

    const/high16 v1, -0x4aa00000

    cmpl-float p0, p0, v1

    if-ltz p0, :cond_0

    :goto_0
    move p0, v0

    goto :goto_1

    :cond_0
    move p0, v2

    goto :goto_1

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p0, v0

    if-lez v1, :cond_2

    const v1, 0x3f800007    # 1.0000008f

    cmpg-float p0, p0, v1

    if-gtz p0, :cond_0

    goto :goto_0

    :cond_2
    :goto_1
    aput p0, p1, p2

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final a(FFFFLX/c;)J
    .locals 20

    move-object/from16 v0, p4

    const/4 v1, 0x1

    const/16 v2, 0x1f

    invoke-virtual/range {p4 .. p4}, LX/c;->c()Z

    move-result v3

    const/16 v4, 0x10

    const/16 v5, 0x20

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    if-eqz v3, :cond_8

    cmpg-float v0, p3, v8

    if-gez v0, :cond_0

    move v0, v8

    goto :goto_0

    :cond_0
    move/from16 v0, p3

    :goto_0
    cmpl-float v1, v0, v7

    if-lez v1, :cond_1

    move v0, v7

    :cond_1
    const/high16 v1, 0x437f0000    # 255.0f

    mul-float/2addr v0, v1

    add-float/2addr v0, v6

    float-to-int v0, v0

    shl-int/lit8 v0, v0, 0x18

    cmpg-float v2, p0, v8

    if-gez v2, :cond_2

    move v2, v8

    goto :goto_1

    :cond_2
    move/from16 v2, p0

    :goto_1
    cmpl-float v3, v2, v7

    if-lez v3, :cond_3

    move v2, v7

    :cond_3
    mul-float/2addr v2, v1

    add-float/2addr v2, v6

    float-to-int v2, v2

    shl-int/2addr v2, v4

    or-int/2addr v0, v2

    cmpg-float v2, p1, v8

    if-gez v2, :cond_4

    move v2, v8

    goto :goto_2

    :cond_4
    move/from16 v2, p1

    :goto_2
    cmpl-float v3, v2, v7

    if-lez v3, :cond_5

    move v2, v7

    :cond_5
    mul-float/2addr v2, v1

    add-float/2addr v2, v6

    float-to-int v2, v2

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v0, v2

    cmpg-float v2, p2, v8

    if-gez v2, :cond_6

    goto :goto_3

    :cond_6
    move/from16 v8, p2

    :goto_3
    cmpl-float v2, v8, v7

    if-lez v2, :cond_7

    goto :goto_4

    :cond_7
    move v7, v8

    :goto_4
    mul-float/2addr v7, v1

    add-float/2addr v7, v6

    float-to-int v1, v7

    or-int/2addr v0, v1

    int-to-long v0, v0

    shl-long/2addr v0, v5

    sget v2, LW/r;->g:I

    return-wide v0

    :cond_8
    sget v3, LX/b;->e:I

    iget-wide v9, v0, LX/c;->b:J

    shr-long/2addr v9, v5

    long-to-int v3, v9

    const/4 v9, 0x3

    if-ne v3, v9, :cond_27

    const/4 v3, -0x1

    iget v9, v0, LX/c;->c:I

    if-eq v9, v3, :cond_26

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, LX/c;->b(I)F

    move-result v10

    invoke-virtual {v0, v3}, LX/c;->a(I)F

    move-result v11

    cmpg-float v12, p0, v10

    if-gez v12, :cond_9

    goto :goto_5

    :cond_9
    move/from16 v10, p0

    :goto_5
    cmpl-float v12, v10, v11

    if-lez v12, :cond_a

    goto :goto_6

    :cond_a
    move v11, v10

    :goto_6
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    ushr-int/lit8 v11, v10, 0x1f

    ushr-int/lit8 v12, v10, 0x17

    const/16 v13, 0xff

    and-int/2addr v12, v13

    const v14, 0x7fffff

    and-int v15, v10, v14

    const/high16 v16, 0x800000

    const/16 v3, -0xa

    const/16 v17, 0x31

    const/16 v18, 0x200

    if-ne v12, v13, :cond_c

    if-eqz v15, :cond_b

    move/from16 v10, v18

    goto :goto_7

    :cond_b
    const/4 v10, 0x0

    :goto_7
    move v12, v2

    goto :goto_a

    :cond_c
    add-int/lit8 v12, v12, -0x70

    if-lt v12, v2, :cond_d

    move/from16 v12, v17

    const/4 v10, 0x0

    goto :goto_a

    :cond_d
    if-gtz v12, :cond_10

    if-lt v12, v3, :cond_f

    or-int v10, v15, v16

    rsub-int/lit8 v12, v12, 0x1

    shr-int/2addr v10, v12

    and-int/lit16 v12, v10, 0x1000

    if-eqz v12, :cond_e

    add-int/lit16 v10, v10, 0x2000

    :cond_e
    shr-int/lit8 v10, v10, 0xd

    :goto_8
    const/4 v12, 0x0

    goto :goto_a

    :cond_f
    const/4 v10, 0x0

    goto :goto_8

    :cond_10
    shr-int/lit8 v15, v15, 0xd

    and-int/lit16 v10, v10, 0x1000

    if-eqz v10, :cond_11

    shl-int/lit8 v10, v12, 0xa

    or-int/2addr v10, v15

    add-int/2addr v10, v1

    shl-int/lit8 v11, v11, 0xf

    or-int/2addr v10, v11

    :goto_9
    int-to-short v10, v10

    goto :goto_b

    :cond_11
    move v10, v15

    :goto_a
    shl-int/lit8 v11, v11, 0xf

    shl-int/lit8 v12, v12, 0xa

    or-int/2addr v11, v12

    or-int/2addr v10, v11

    goto :goto_9

    :goto_b
    invoke-virtual {v0, v1}, LX/c;->b(I)F

    move-result v11

    invoke-virtual {v0, v1}, LX/c;->a(I)F

    move-result v12

    cmpg-float v15, p1, v11

    if-gez v15, :cond_12

    goto :goto_c

    :cond_12
    move/from16 v11, p1

    :goto_c
    cmpl-float v15, v11, v12

    if-lez v15, :cond_13

    goto :goto_d

    :cond_13
    move v12, v11

    :goto_d
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11

    ushr-int/lit8 v12, v11, 0x1f

    ushr-int/lit8 v15, v11, 0x17

    and-int/2addr v15, v13

    and-int v19, v11, v14

    if-ne v15, v13, :cond_15

    if-eqz v19, :cond_14

    move/from16 v11, v18

    goto :goto_e

    :cond_14
    const/4 v11, 0x0

    :goto_e
    move v15, v2

    goto :goto_11

    :cond_15
    add-int/lit8 v15, v15, -0x70

    if-lt v15, v2, :cond_16

    move/from16 v15, v17

    const/4 v11, 0x0

    goto :goto_11

    :cond_16
    if-gtz v15, :cond_19

    if-lt v15, v3, :cond_18

    or-int v11, v19, v16

    rsub-int/lit8 v15, v15, 0x1

    shr-int/2addr v11, v15

    and-int/lit16 v15, v11, 0x1000

    if-eqz v15, :cond_17

    add-int/lit16 v11, v11, 0x2000

    :cond_17
    shr-int/lit8 v11, v11, 0xd

    :goto_f
    const/4 v15, 0x0

    goto :goto_11

    :cond_18
    const/4 v11, 0x0

    goto :goto_f

    :cond_19
    shr-int/lit8 v19, v19, 0xd

    and-int/lit16 v11, v11, 0x1000

    if-eqz v11, :cond_1a

    shl-int/lit8 v11, v15, 0xa

    or-int v11, v11, v19

    add-int/2addr v11, v1

    shl-int/lit8 v12, v12, 0xf

    or-int/2addr v11, v12

    :goto_10
    int-to-short v11, v11

    goto :goto_12

    :cond_1a
    move/from16 v11, v19

    :goto_11
    shl-int/lit8 v12, v12, 0xf

    shl-int/lit8 v15, v15, 0xa

    or-int/2addr v12, v15

    or-int/2addr v11, v12

    goto :goto_10

    :goto_12
    const/4 v12, 0x2

    invoke-virtual {v0, v12}, LX/c;->b(I)F

    move-result v15

    invoke-virtual {v0, v12}, LX/c;->a(I)F

    move-result v0

    cmpg-float v12, p2, v15

    if-gez v12, :cond_1b

    goto :goto_13

    :cond_1b
    move/from16 v15, p2

    :goto_13
    cmpl-float v12, v15, v0

    if-lez v12, :cond_1c

    goto :goto_14

    :cond_1c
    move v0, v15

    :goto_14
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    ushr-int/lit8 v12, v0, 0x1f

    ushr-int/lit8 v15, v0, 0x17

    and-int/2addr v15, v13

    and-int/2addr v14, v0

    if-ne v15, v13, :cond_1d

    if-eqz v14, :cond_1e

    move/from16 v3, v18

    goto :goto_17

    :cond_1d
    add-int/lit8 v15, v15, -0x70

    if-lt v15, v2, :cond_1f

    move/from16 v2, v17

    :cond_1e
    :goto_15
    const/4 v3, 0x0

    goto :goto_17

    :cond_1f
    if-gtz v15, :cond_22

    if-lt v15, v3, :cond_21

    or-int v0, v14, v16

    sub-int/2addr v1, v15

    shr-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_20

    add-int/lit16 v0, v0, 0x2000

    :cond_20
    shr-int/lit8 v0, v0, 0xd

    move v3, v0

    const/4 v2, 0x0

    goto :goto_17

    :cond_21
    const/4 v2, 0x0

    goto :goto_15

    :cond_22
    shr-int/lit8 v3, v14, 0xd

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_23

    shl-int/lit8 v0, v15, 0xa

    or-int/2addr v0, v3

    add-int/2addr v0, v1

    shl-int/lit8 v1, v12, 0xf

    or-int/2addr v0, v1

    :goto_16
    int-to-short v0, v0

    goto :goto_18

    :cond_23
    move v2, v15

    :goto_17
    shl-int/lit8 v0, v12, 0xf

    shl-int/lit8 v1, v2, 0xa

    or-int/2addr v0, v1

    or-int/2addr v0, v3

    goto :goto_16

    :goto_18
    cmpg-float v1, p3, v8

    if-gez v1, :cond_24

    goto :goto_19

    :cond_24
    move/from16 v8, p3

    :goto_19
    cmpl-float v1, v8, v7

    if-lez v1, :cond_25

    goto :goto_1a

    :cond_25
    move v7, v8

    :goto_1a
    const v1, 0x447fc000    # 1023.0f

    mul-float/2addr v7, v1

    add-float/2addr v7, v6

    float-to-int v1, v7

    int-to-long v2, v10

    const-wide/32 v6, 0xffff

    and-long/2addr v2, v6

    const/16 v8, 0x30

    shl-long/2addr v2, v8

    int-to-long v10, v11

    and-long/2addr v10, v6

    shl-long/2addr v10, v5

    or-long/2addr v2, v10

    int-to-long v10, v0

    and-long v5, v10, v6

    shl-long v4, v5, v4

    or-long/2addr v2, v4

    int-to-long v0, v1

    const-wide/16 v4, 0x3ff

    and-long/2addr v0, v4

    const/4 v4, 0x6

    shl-long/2addr v0, v4

    or-long/2addr v0, v2

    int-to-long v2, v9

    const-wide/16 v4, 0x3f

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    sget v2, LW/r;->g:I

    return-wide v0

    :cond_26
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown color space, please use a color space in ColorSpaces"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_27
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Color only works with ColorSpaces with 3 components"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final b(I)J
    .locals 2

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    sget p0, LW/r;->g:I

    return-wide v0
.end method

.method public static final c(J)J
    .locals 1

    const/16 v0, 0x20

    shl-long/2addr p0, v0

    sget v0, LW/r;->g:I

    return-wide p0
.end method

.method public static d(III)J
    .locals 1

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x10

    const/high16 v0, -0x1000000

    or-int/2addr p0, v0

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    and-int/lit16 p1, p2, 0xff

    or-int/2addr p0, p1

    invoke-static {p0}, LW/D;->b(I)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final e()LW/g;
    .locals 3

    new-instance v0, LW/g;

    new-instance v1, Landroid/graphics/Paint;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    invoke-direct {v0, v1}, LW/g;-><init>(Landroid/graphics/Paint;)V

    return-object v0
.end method

.method public static final f()LW/i;
    .locals 2

    new-instance v0, LW/i;

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    invoke-direct {v0, v1}, LW/i;-><init>(Landroid/graphics/Path;)V

    return-object v0
.end method

.method public static final g([FI[FI)F
    .locals 3

    const/4 v0, 0x4

    mul-int/2addr p1, v0

    aget v1, p0, p1

    aget v2, p2, p3

    mul-float/2addr v1, v2

    add-int/lit8 v2, p1, 0x1

    aget v2, p0, v2

    add-int/2addr v0, p3

    aget v0, p2, v0

    mul-float/2addr v2, v0

    add-float/2addr v2, v1

    add-int/lit8 v0, p1, 0x2

    aget v0, p0, v0

    const/16 v1, 0x8

    add-int/2addr v1, p3

    aget v1, p2, v1

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    add-int/lit8 p1, p1, 0x3

    aget p0, p0, p1

    const/16 p1, 0xc

    add-int/2addr p1, p3

    aget p1, p2, p1

    mul-float/2addr p0, p1

    add-float/2addr p0, v0

    return p0
.end method

.method public static final i(JJ)J
    .locals 20

    invoke-static/range {p2 .. p3}, LW/r;->f(J)LX/c;

    move-result-object v0

    move-wide/from16 v1, p0

    invoke-static {v1, v2, v0}, LW/r;->a(JLX/c;)J

    move-result-wide v0

    invoke-static/range {p2 .. p3}, LW/r;->d(J)F

    move-result v2

    invoke-static {v0, v1}, LW/r;->d(J)F

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    sub-float v5, v4, v3

    mul-float v6, v2, v5

    add-float/2addr v6, v3

    invoke-static {v0, v1}, LW/r;->h(J)F

    move-result v7

    invoke-static/range {p2 .. p3}, LW/r;->h(J)F

    move-result v8

    const/4 v9, 0x0

    cmpg-float v10, v6, v9

    if-nez v10, :cond_0

    move v8, v9

    goto :goto_0

    :cond_0
    mul-float/2addr v7, v3

    mul-float/2addr v8, v2

    mul-float/2addr v8, v5

    add-float/2addr v8, v7

    div-float/2addr v8, v6

    :goto_0
    invoke-static {v0, v1}, LW/r;->g(J)F

    move-result v7

    invoke-static/range {p2 .. p3}, LW/r;->g(J)F

    move-result v11

    if-nez v10, :cond_1

    move v11, v9

    goto :goto_1

    :cond_1
    mul-float/2addr v7, v3

    mul-float/2addr v11, v2

    mul-float/2addr v11, v5

    add-float/2addr v11, v7

    div-float/2addr v11, v6

    :goto_1
    invoke-static {v0, v1}, LW/r;->e(J)F

    move-result v0

    invoke-static/range {p2 .. p3}, LW/r;->e(J)F

    move-result v1

    if-nez v10, :cond_2

    move v1, v9

    goto :goto_2

    :cond_2
    mul-float/2addr v0, v3

    mul-float/2addr v1, v2

    mul-float/2addr v1, v5

    add-float/2addr v1, v0

    div-float/2addr v1, v6

    :goto_2
    invoke-static/range {p2 .. p3}, LW/r;->f(J)LX/c;

    move-result-object v0

    invoke-virtual {v0}, LX/c;->c()Z

    move-result v2

    const/16 v3, 0x20

    const/16 v5, 0x10

    const/high16 v7, 0x3f000000    # 0.5f

    if-eqz v2, :cond_3

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr v6, v0

    add-float/2addr v6, v7

    float-to-int v2, v6

    shl-int/lit8 v2, v2, 0x18

    mul-float/2addr v8, v0

    add-float/2addr v8, v7

    float-to-int v4, v8

    shl-int/2addr v4, v5

    or-int/2addr v2, v4

    mul-float/2addr v11, v0

    add-float/2addr v11, v7

    float-to-int v4, v11

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v2, v4

    mul-float/2addr v1, v0

    add-float/2addr v1, v7

    float-to-int v0, v1

    or-int/2addr v0, v2

    int-to-long v0, v0

    shl-long/2addr v0, v3

    goto/16 :goto_f

    :cond_3
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    ushr-int/lit8 v8, v2, 0x1f

    ushr-int/lit8 v10, v2, 0x17

    const/16 v12, 0xff

    and-int/2addr v10, v12

    const v13, 0x7fffff

    and-int v14, v2, v13

    const/16 v15, 0x1f

    const/high16 v16, 0x800000

    const/16 v5, -0xa

    const/16 v17, 0x31

    const/16 v18, 0x200

    const/16 v19, 0x0

    if-ne v10, v12, :cond_5

    if-eqz v14, :cond_4

    move/from16 v2, v18

    goto :goto_3

    :cond_4
    move/from16 v2, v19

    :goto_3
    move v10, v15

    goto :goto_5

    :cond_5
    add-int/lit8 v10, v10, -0x70

    if-lt v10, v15, :cond_6

    move/from16 v10, v17

    move/from16 v2, v19

    goto :goto_5

    :cond_6
    if-gtz v10, :cond_9

    if-lt v10, v5, :cond_8

    or-int v2, v14, v16

    rsub-int/lit8 v10, v10, 0x1

    shr-int/2addr v2, v10

    and-int/lit16 v10, v2, 0x1000

    if-eqz v10, :cond_7

    add-int/lit16 v2, v2, 0x2000

    :cond_7
    shr-int/lit8 v2, v2, 0xd

    move/from16 v10, v19

    goto :goto_5

    :cond_8
    move/from16 v2, v19

    move v10, v2

    goto :goto_5

    :cond_9
    shr-int/lit8 v14, v14, 0xd

    and-int/lit16 v2, v2, 0x1000

    if-eqz v2, :cond_a

    shl-int/lit8 v2, v10, 0xa

    or-int/2addr v2, v14

    add-int/lit8 v2, v2, 0x1

    shl-int/lit8 v8, v8, 0xf

    or-int/2addr v2, v8

    :goto_4
    int-to-short v2, v2

    goto :goto_6

    :cond_a
    move v2, v14

    :goto_5
    shl-int/lit8 v8, v8, 0xf

    shl-int/lit8 v10, v10, 0xa

    or-int/2addr v8, v10

    or-int/2addr v2, v8

    goto :goto_4

    :goto_6
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    ushr-int/lit8 v10, v8, 0x1f

    ushr-int/lit8 v11, v8, 0x17

    and-int/2addr v11, v12

    and-int v14, v8, v13

    if-ne v11, v12, :cond_c

    if-eqz v14, :cond_b

    move/from16 v8, v18

    goto :goto_7

    :cond_b
    move/from16 v8, v19

    :goto_7
    move v11, v15

    goto :goto_9

    :cond_c
    add-int/lit8 v11, v11, -0x70

    if-lt v11, v15, :cond_d

    move/from16 v11, v17

    move/from16 v8, v19

    goto :goto_9

    :cond_d
    if-gtz v11, :cond_10

    if-lt v11, v5, :cond_f

    or-int v8, v14, v16

    rsub-int/lit8 v11, v11, 0x1

    shr-int/2addr v8, v11

    and-int/lit16 v11, v8, 0x1000

    if-eqz v11, :cond_e

    add-int/lit16 v8, v8, 0x2000

    :cond_e
    shr-int/lit8 v8, v8, 0xd

    move/from16 v11, v19

    goto :goto_9

    :cond_f
    move/from16 v8, v19

    move v11, v8

    goto :goto_9

    :cond_10
    shr-int/lit8 v14, v14, 0xd

    and-int/lit16 v8, v8, 0x1000

    if-eqz v8, :cond_11

    shl-int/lit8 v8, v11, 0xa

    or-int/2addr v8, v14

    add-int/lit8 v8, v8, 0x1

    shl-int/lit8 v10, v10, 0xf

    or-int/2addr v8, v10

    :goto_8
    int-to-short v8, v8

    goto :goto_a

    :cond_11
    move v8, v14

    :goto_9
    shl-int/lit8 v10, v10, 0xf

    shl-int/lit8 v11, v11, 0xa

    or-int/2addr v10, v11

    or-int/2addr v8, v10

    goto :goto_8

    :goto_a
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    ushr-int/lit8 v10, v1, 0x1f

    ushr-int/lit8 v11, v1, 0x17

    and-int/2addr v11, v12

    and-int/2addr v13, v1

    if-ne v11, v12, :cond_13

    if-eqz v13, :cond_12

    goto :goto_b

    :cond_12
    move/from16 v18, v19

    :goto_b
    move/from16 v19, v18

    goto :goto_d

    :cond_13
    add-int/lit8 v11, v11, -0x70

    if-lt v11, v15, :cond_14

    move/from16 v15, v17

    goto :goto_d

    :cond_14
    if-gtz v11, :cond_17

    if-lt v11, v5, :cond_16

    or-int v1, v13, v16

    rsub-int/lit8 v5, v11, 0x1

    shr-int/2addr v1, v5

    and-int/lit16 v5, v1, 0x1000

    if-eqz v5, :cond_15

    add-int/lit16 v1, v1, 0x2000

    :cond_15
    shr-int/lit8 v1, v1, 0xd

    move/from16 v15, v19

    move/from16 v19, v1

    goto :goto_d

    :cond_16
    move/from16 v15, v19

    goto :goto_d

    :cond_17
    shr-int/lit8 v19, v13, 0xd

    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_18

    shl-int/lit8 v1, v11, 0xa

    or-int v1, v1, v19

    add-int/lit8 v1, v1, 0x1

    shl-int/lit8 v5, v10, 0xf

    or-int/2addr v1, v5

    :goto_c
    int-to-short v1, v1

    goto :goto_e

    :cond_18
    move v15, v11

    :goto_d
    shl-int/lit8 v1, v10, 0xf

    shl-int/lit8 v5, v15, 0xa

    or-int/2addr v1, v5

    or-int v1, v1, v19

    goto :goto_c

    :goto_e
    invoke-static {v6, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-static {v9, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    const v5, 0x447fc000    # 1023.0f

    mul-float/2addr v4, v5

    add-float/2addr v4, v7

    float-to-int v4, v4

    int-to-long v5, v2

    const-wide/32 v9, 0xffff

    and-long/2addr v5, v9

    const/16 v2, 0x30

    shl-long/2addr v5, v2

    int-to-long v7, v8

    and-long/2addr v7, v9

    shl-long v2, v7, v3

    or-long/2addr v2, v5

    int-to-long v5, v1

    and-long/2addr v5, v9

    const/16 v1, 0x10

    shl-long/2addr v5, v1

    or-long v1, v2, v5

    int-to-long v3, v4

    const-wide/16 v5, 0x3ff

    and-long/2addr v3, v5

    const/4 v5, 0x6

    shl-long/2addr v3, v5

    or-long/2addr v1, v3

    iget v0, v0, LX/c;->c:I

    int-to-long v3, v0

    const-wide/16 v5, 0x3f

    and-long/2addr v3, v5

    or-long v0, v1, v3

    :goto_f
    return-wide v0
.end method

.method public static j()[F
    .locals 4

    const/16 v0, 0x10

    new-array v0, v0, [F

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    const/4 v1, 0x1

    const/4 v3, 0x0

    aput v3, v0, v1

    const/4 v1, 0x2

    aput v3, v0, v1

    const/4 v1, 0x3

    aput v3, v0, v1

    const/4 v1, 0x4

    aput v3, v0, v1

    const/4 v1, 0x5

    aput v2, v0, v1

    const/4 v1, 0x6

    aput v3, v0, v1

    const/4 v1, 0x7

    aput v3, v0, v1

    const/16 v1, 0x8

    aput v3, v0, v1

    const/16 v1, 0x9

    aput v3, v0, v1

    const/16 v1, 0xa

    aput v2, v0, v1

    const/16 v1, 0xb

    aput v3, v0, v1

    const/16 v1, 0xc

    aput v3, v0, v1

    const/16 v1, 0xd

    aput v3, v0, v1

    const/16 v1, 0xe

    aput v3, v0, v1

    const/16 v1, 0xf

    aput v2, v0, v1

    return-object v0
.end method

.method public static k(Landroid/graphics/Canvas;Z)V
    .locals 10

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    sget-object v0, LW/q;->a:LW/q;

    invoke-virtual {v0, p0, p1}, LW/q;->a(Landroid/graphics/Canvas;Z)V

    goto/16 :goto_3

    :cond_0
    sget-boolean v1, LW/D;->d:Z

    const/4 v2, 0x0

    if-nez v1, :cond_4

    const/16 v1, 0x1c

    const-string v3, "insertInorderBarrier"

    const-string v4, "insertReorderBarrier"

    const/4 v5, 0x1

    const-class v6, Landroid/graphics/Canvas;

    if-ne v0, v1, :cond_1

    :try_start_0
    const-class v0, Ljava/lang/Class;

    const-string v1, "getDeclaredMethod"

    const-class v7, Ljava/lang/String;

    const/4 v8, 0x0

    new-array v9, v8, [Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    filled-new-array {v7, v9}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v0, v1, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v8, [Ljava/lang/Class;

    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    sput-object v1, LW/D;->b:Ljava/lang/reflect/Method;

    new-array v1, v8, [Ljava/lang/Class;

    filled-new-array {v3, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    sput-object v0, LW/D;->c:Ljava/lang/reflect/Method;

    goto :goto_0

    :cond_1
    invoke-virtual {v6, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, LW/D;->b:Ljava/lang/reflect/Method;

    invoke-virtual {v6, v3, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, LW/D;->c:Ljava/lang/reflect/Method;

    :goto_0
    sget-object v0, LW/D;->b:Ljava/lang/reflect/Method;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :goto_1
    sget-object v0, LW/D;->c:Ljava/lang/reflect/Method;

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_2
    sput-boolean v5, LW/D;->d:Z

    :cond_4
    if-eqz p1, :cond_5

    :try_start_1
    sget-object v0, LW/D;->b:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    if-nez p1, :cond_6

    sget-object p1, LW/D;->c:Ljava/lang/reflect/Method;

    if-eqz p1, :cond_6

    invoke-virtual {p1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_6
    :goto_3
    return-void
.end method

.method public static final l(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final m(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final n(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final o(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final p(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final q(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static r()J
    .locals 2

    sget-wide v0, LW/r;->b:J

    return-wide v0
.end method

.method public static final s(J)F
    .locals 7

    invoke-static {p0, p1}, LW/r;->f(J)LX/c;

    move-result-object v0

    iget-wide v1, v0, LX/c;->b:J

    sget-wide v3, LX/b;->a:J

    invoke-static {v1, v2, v3, v4}, LX/b;->a(JJ)Z

    move-result v1

    if-eqz v1, :cond_2

    check-cast v0, LX/r;

    invoke-static {p0, p1}, LW/r;->h(J)F

    move-result v1

    float-to-double v1, v1

    iget-object v0, v0, LX/r;->p:LX/n;

    invoke-virtual {v0, v1, v2}, LX/n;->b(D)D

    move-result-wide v1

    invoke-static {p0, p1}, LW/r;->g(J)F

    move-result v3

    float-to-double v3, v3

    invoke-virtual {v0, v3, v4}, LX/n;->b(D)D

    move-result-wide v3

    invoke-static {p0, p1}, LW/r;->e(J)F

    move-result p0

    float-to-double p0, p0

    invoke-virtual {v0, p0, p1}, LX/n;->b(D)D

    move-result-wide p0

    const-wide v5, 0x3fcb367a0f9096bcL    # 0.2126

    mul-double/2addr v1, v5

    const-wide v5, 0x3fe6e2eb1c432ca5L    # 0.7152

    mul-double/2addr v3, v5

    add-double/2addr v3, v1

    const-wide v0, 0x3fb27bb2fec56d5dL    # 0.0722

    mul-double/2addr p0, v0

    add-double/2addr p0, v3

    double-to-float p0, p0

    const/4 p1, 0x0

    cmpg-float v0, p0, p1

    if-gez v0, :cond_0

    move p0, p1

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    cmpl-float v0, p0, p1

    if-lez v0, :cond_1

    move p0, p1

    :cond_1
    return p0

    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "The specified color must be encoded in an RGB color space. The supplied color space is "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v0, v0, LX/c;->b:J

    invoke-static {v0, v1}, LX/b;->b(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final t([FJ)J
    .locals 4

    invoke-static {p1, p2}, LV/c;->b(J)F

    move-result v0

    invoke-static {p1, p2}, LV/c;->c(J)F

    move-result p1

    const/4 p2, 0x3

    aget p2, p0, p2

    mul-float/2addr p2, v0

    const/4 v1, 0x7

    aget v1, p0, v1

    mul-float/2addr v1, p1

    add-float/2addr v1, p2

    const/16 p2, 0xf

    aget p2, p0, p2

    add-float/2addr v1, p2

    const/4 p2, 0x1

    int-to-float v2, p2

    div-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v1, 0x0

    aget v1, p0, v1

    mul-float/2addr v1, v0

    const/4 v3, 0x4

    aget v3, p0, v3

    mul-float/2addr v3, p1

    add-float/2addr v3, v1

    const/16 v1, 0xc

    aget v1, p0, v1

    add-float/2addr v3, v1

    mul-float/2addr v3, v2

    aget p2, p0, p2

    mul-float/2addr p2, v0

    const/4 v0, 0x5

    aget v0, p0, v0

    mul-float/2addr v0, p1

    add-float/2addr v0, p2

    const/16 p1, 0xd

    aget p0, p0, p1

    add-float/2addr v0, p0

    mul-float/2addr v0, v2

    invoke-static {v3, v0}, Lr2/a;->f(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final u([FLV/b;)V
    .locals 10

    iget v0, p1, LV/b;->a:F

    iget v1, p1, LV/b;->b:F

    invoke-static {v0, v1}, Lr2/a;->f(FF)J

    move-result-wide v0

    invoke-static {p0, v0, v1}, LW/D;->t([FJ)J

    move-result-wide v0

    iget v2, p1, LV/b;->a:F

    iget v3, p1, LV/b;->d:F

    invoke-static {v2, v3}, Lr2/a;->f(FF)J

    move-result-wide v2

    invoke-static {p0, v2, v3}, LW/D;->t([FJ)J

    move-result-wide v2

    iget v4, p1, LV/b;->c:F

    iget v5, p1, LV/b;->b:F

    invoke-static {v4, v5}, Lr2/a;->f(FF)J

    move-result-wide v4

    invoke-static {p0, v4, v5}, LW/D;->t([FJ)J

    move-result-wide v4

    iget v6, p1, LV/b;->c:F

    iget v7, p1, LV/b;->d:F

    invoke-static {v6, v7}, Lr2/a;->f(FF)J

    move-result-wide v6

    invoke-static {p0, v6, v7}, LW/D;->t([FJ)J

    move-result-wide v6

    invoke-static {v0, v1}, LV/c;->b(J)F

    move-result p0

    invoke-static {v2, v3}, LV/c;->b(J)F

    move-result v8

    invoke-static {p0, v8}, Ljava/lang/Math;->min(FF)F

    move-result p0

    invoke-static {v4, v5}, LV/c;->b(J)F

    move-result v8

    invoke-static {v6, v7}, LV/c;->b(J)F

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    move-result v8

    invoke-static {p0, v8}, Ljava/lang/Math;->min(FF)F

    move-result p0

    iput p0, p1, LV/b;->a:F

    invoke-static {v0, v1}, LV/c;->c(J)F

    move-result p0

    invoke-static {v2, v3}, LV/c;->c(J)F

    move-result v8

    invoke-static {p0, v8}, Ljava/lang/Math;->min(FF)F

    move-result p0

    invoke-static {v4, v5}, LV/c;->c(J)F

    move-result v8

    invoke-static {v6, v7}, LV/c;->c(J)F

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    move-result v8

    invoke-static {p0, v8}, Ljava/lang/Math;->min(FF)F

    move-result p0

    iput p0, p1, LV/b;->b:F

    invoke-static {v0, v1}, LV/c;->b(J)F

    move-result p0

    invoke-static {v2, v3}, LV/c;->b(J)F

    move-result v8

    invoke-static {p0, v8}, Ljava/lang/Math;->max(FF)F

    move-result p0

    invoke-static {v4, v5}, LV/c;->b(J)F

    move-result v8

    invoke-static {v6, v7}, LV/c;->b(J)F

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    move-result v8

    invoke-static {p0, v8}, Ljava/lang/Math;->max(FF)F

    move-result p0

    iput p0, p1, LV/b;->c:F

    invoke-static {v0, v1}, LV/c;->c(J)F

    move-result p0

    invoke-static {v2, v3}, LV/c;->c(J)F

    move-result v0

    invoke-static {p0, v0}, Ljava/lang/Math;->max(FF)F

    move-result p0

    invoke-static {v4, v5}, LV/c;->c(J)F

    move-result v0

    invoke-static {v6, v7}, LV/c;->c(J)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {p0, v0}, Ljava/lang/Math;->max(FF)F

    move-result p0

    iput p0, p1, LV/b;->d:F

    return-void
.end method

.method public static final v([F)V
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_2

    move v3, v0

    :goto_1
    if-ge v3, v2, :cond_1

    if-ne v1, v3, :cond_0

    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_0
    const/4 v4, 0x0

    :goto_2
    mul-int/lit8 v5, v3, 0x4

    add-int/2addr v5, v1

    aput v4, p0, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static final w([FF)V
    .locals 20

    move/from16 v0, p1

    float-to-double v0, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v0, v2

    const-wide v2, 0x4066800000000000L    # 180.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/4 v1, 0x0

    aget v3, p0, v1

    const/4 v4, 0x4

    aget v5, p0, v4

    mul-float v6, v2, v3

    mul-float v7, v0, v5

    add-float/2addr v7, v6

    neg-float v6, v0

    mul-float/2addr v3, v6

    mul-float/2addr v5, v2

    add-float/2addr v5, v3

    const/4 v3, 0x1

    aget v8, p0, v3

    const/4 v9, 0x5

    aget v10, p0, v9

    mul-float v11, v2, v8

    mul-float v12, v0, v10

    add-float/2addr v12, v11

    mul-float/2addr v8, v6

    mul-float/2addr v10, v2

    add-float/2addr v10, v8

    const/4 v8, 0x2

    aget v11, p0, v8

    const/4 v13, 0x6

    aget v14, p0, v13

    mul-float v15, v2, v11

    mul-float v16, v0, v14

    add-float v16, v16, v15

    mul-float/2addr v11, v6

    mul-float/2addr v14, v2

    add-float/2addr v14, v11

    const/4 v11, 0x3

    aget v15, p0, v11

    const/16 v17, 0x7

    aget v18, p0, v17

    mul-float v19, v2, v15

    mul-float v0, v0, v18

    add-float v0, v0, v19

    mul-float/2addr v6, v15

    mul-float v2, v2, v18

    add-float/2addr v2, v6

    aput v7, p0, v1

    aput v12, p0, v3

    aput v16, p0, v8

    aput v0, p0, v11

    aput v5, p0, v4

    aput v10, p0, v9

    aput v14, p0, v13

    aput v2, p0, v17

    return-void
.end method

.method public static final x([FFFF)V
    .locals 2

    const/4 v0, 0x0

    aget v1, p0, v0

    mul-float/2addr v1, p1

    aput v1, p0, v0

    const/4 v0, 0x1

    aget v1, p0, v0

    mul-float/2addr v1, p1

    aput v1, p0, v0

    const/4 v0, 0x2

    aget v1, p0, v0

    mul-float/2addr v1, p1

    aput v1, p0, v0

    const/4 v0, 0x3

    aget v1, p0, v0

    mul-float/2addr v1, p1

    aput v1, p0, v0

    const/4 p1, 0x4

    aget v0, p0, p1

    mul-float/2addr v0, p2

    aput v0, p0, p1

    const/4 p1, 0x5

    aget v0, p0, p1

    mul-float/2addr v0, p2

    aput v0, p0, p1

    const/4 p1, 0x6

    aget v0, p0, p1

    mul-float/2addr v0, p2

    aput v0, p0, p1

    const/4 p1, 0x7

    aget v0, p0, p1

    mul-float/2addr v0, p2

    aput v0, p0, p1

    const/16 p1, 0x8

    aget p2, p0, p1

    mul-float/2addr p2, p3

    aput p2, p0, p1

    const/16 p1, 0x9

    aget p2, p0, p1

    mul-float/2addr p2, p3

    aput p2, p0, p1

    const/16 p1, 0xa

    aget p2, p0, p1

    mul-float/2addr p2, p3

    aput p2, p0, p1

    const/16 p1, 0xb

    aget p2, p0, p1

    mul-float/2addr p2, p3

    aput p2, p0, p1

    return-void
.end method

.method public static final y([FLandroid/graphics/Matrix;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    aget v4, v0, v3

    const/4 v5, 0x2

    aget v6, v0, v5

    const/4 v7, 0x3

    aget v8, v0, v7

    const/4 v9, 0x4

    aget v10, v0, v9

    const/4 v11, 0x5

    aget v12, v0, v11

    const/4 v13, 0x6

    aget v14, v0, v13

    const/4 v15, 0x7

    aget v16, v0, v15

    const/16 v17, 0x8

    aget v18, v0, v17

    aput v2, v0, v1

    aput v8, v0, v3

    const/4 v1, 0x0

    aput v1, v0, v5

    aput v14, v0, v7

    aput v4, v0, v9

    aput v10, v0, v11

    aput v1, v0, v13

    aput v16, v0, v15

    aput v1, v0, v17

    const/16 v2, 0x9

    aput v1, v0, v2

    const/16 v2, 0xa

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v0, v2

    const/16 v2, 0xb

    aput v1, v0, v2

    const/16 v2, 0xc

    aput v6, v0, v2

    const/16 v2, 0xd

    aput v12, v0, v2

    const/16 v2, 0xe

    aput v1, v0, v2

    const/16 v1, 0xf

    aput v18, v0, v1

    return-void
.end method

.method public static final z([F[F)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LW/D;->g([FI[FI)F

    move-result v3

    const/4 v4, 0x1

    invoke-static {v0, v2, v1, v4}, LW/D;->g([FI[FI)F

    move-result v5

    const/4 v6, 0x2

    invoke-static {v0, v2, v1, v6}, LW/D;->g([FI[FI)F

    move-result v7

    const/4 v8, 0x3

    invoke-static {v0, v2, v1, v8}, LW/D;->g([FI[FI)F

    move-result v9

    invoke-static {v0, v4, v1, v2}, LW/D;->g([FI[FI)F

    move-result v10

    invoke-static {v0, v4, v1, v4}, LW/D;->g([FI[FI)F

    move-result v11

    invoke-static {v0, v4, v1, v6}, LW/D;->g([FI[FI)F

    move-result v12

    invoke-static {v0, v4, v1, v8}, LW/D;->g([FI[FI)F

    move-result v13

    invoke-static {v0, v6, v1, v2}, LW/D;->g([FI[FI)F

    move-result v14

    invoke-static {v0, v6, v1, v4}, LW/D;->g([FI[FI)F

    move-result v15

    invoke-static {v0, v6, v1, v6}, LW/D;->g([FI[FI)F

    move-result v16

    invoke-static {v0, v6, v1, v8}, LW/D;->g([FI[FI)F

    move-result v17

    invoke-static {v0, v8, v1, v2}, LW/D;->g([FI[FI)F

    move-result v18

    invoke-static {v0, v8, v1, v4}, LW/D;->g([FI[FI)F

    move-result v19

    invoke-static {v0, v8, v1, v6}, LW/D;->g([FI[FI)F

    move-result v20

    invoke-static {v0, v8, v1, v8}, LW/D;->g([FI[FI)F

    move-result v1

    aput v3, v0, v2

    aput v5, v0, v4

    aput v7, v0, v6

    aput v9, v0, v8

    const/4 v2, 0x4

    aput v10, v0, v2

    const/4 v2, 0x5

    aput v11, v0, v2

    const/4 v2, 0x6

    aput v12, v0, v2

    const/4 v2, 0x7

    aput v13, v0, v2

    const/16 v2, 0x8

    aput v14, v0, v2

    const/16 v2, 0x9

    aput v15, v0, v2

    const/16 v2, 0xa

    aput v16, v0, v2

    const/16 v2, 0xb

    aput v17, v0, v2

    const/16 v2, 0xc

    aput v18, v0, v2

    const/16 v2, 0xd

    aput v19, v0, v2

    const/16 v2, 0xe

    aput v20, v0, v2

    const/16 v2, 0xf

    aput v1, v0, v2

    return-void
.end method


# virtual methods
.method public abstract h(FJLW/g;)V
.end method
