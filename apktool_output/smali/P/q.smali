.class public final Lp/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/r;


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F


# direct methods
.method public constructor <init>(FF)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput v1, v0, Lp/q;->a:F

    iput v2, v0, Lp/q;->b:F

    invoke-static/range {p1 .. p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_5

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_5

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_5

    const/4 v1, 0x5

    new-array v1, v1, [F

    float-to-double v5, v3

    const/high16 v2, 0x40400000    # 3.0f

    float-to-double v7, v2

    float-to-double v9, v3

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    mul-double v13, v7, v11

    sub-double v15, v5, v13

    add-double/2addr v15, v9

    const-wide/16 v17, 0x0

    cmpg-double v17, v15, v17

    const/4 v2, 0x0

    if-nez v17, :cond_1

    cmpg-double v5, v7, v9

    if-nez v5, :cond_0

    move v5, v2

    goto :goto_0

    :cond_0
    sub-double v5, v13, v9

    mul-double/2addr v9, v11

    sub-double/2addr v13, v9

    div-double/2addr v5, v13

    double-to-float v5, v5

    invoke-static {v5, v1, v2}, LW/D;->G(F[FI)I

    move-result v5

    goto :goto_0

    :cond_1
    mul-double v11, v7, v7

    mul-double/2addr v9, v5

    sub-double/2addr v11, v9

    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v9

    neg-double v9, v9

    neg-double v5, v5

    add-double/2addr v5, v7

    add-double v7, v9, v5

    neg-double v7, v7

    div-double/2addr v7, v15

    double-to-float v7, v7

    invoke-static {v7, v1, v2}, LW/D;->G(F[FI)I

    move-result v7

    sub-double/2addr v9, v5

    div-double/2addr v9, v15

    double-to-float v5, v9

    invoke-static {v5, v1, v7}, LW/D;->G(F[FI)I

    move-result v5

    add-int/2addr v5, v7

    const/4 v6, 0x1

    if-le v5, v6, :cond_3

    aget v7, v1, v2

    aget v8, v1, v6

    cmpl-float v9, v7, v8

    if-lez v9, :cond_2

    aput v8, v1, v2

    aput v7, v1, v6

    goto :goto_0

    :cond_2
    cmpg-float v6, v7, v8

    if-nez v6, :cond_3

    add-int/lit8 v5, v5, -0x1

    :cond_3
    :goto_0
    const/high16 v6, 0x3f000000    # 0.5f

    invoke-static {v6, v1, v5}, LW/D;->G(F[FI)I

    move-result v6

    add-int/2addr v6, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    :goto_1
    if-ge v2, v6, :cond_4

    aget v7, v1, v2

    const/high16 v8, -0x40000000    # -2.0f

    mul-float/2addr v8, v7

    const/high16 v9, 0x40400000    # 3.0f

    add-float/2addr v8, v9

    mul-float/2addr v8, v7

    add-float/2addr v8, v3

    mul-float/2addr v8, v7

    add-float/2addr v8, v3

    invoke-static {v5, v8}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v4, v8}, Ljava/lang/Math;->max(FF)F

    move-result v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    const/16 v5, 0x20

    shl-long/2addr v1, v5

    const-wide v6, 0xffffffffL

    and-long/2addr v3, v6

    or-long/2addr v1, v3

    shr-long v3, v1, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    iput v3, v0, Lp/q;->c:F

    and-long/2addr v1, v6

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    iput v1, v0, Lp/q;->d:F

    return-void

    :cond_5
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", 0.0, "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", 1.0."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method


# virtual methods
.method public final a(F)F
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    if-lez v3, :cond_20

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v4, v1, v3

    if-gez v4, :cond_20

    sub-float v4, v2, v1

    iget v5, v0, Lp/q;->a:F

    sub-float v6, v5, v1

    iget v7, v0, Lp/q;->b:F

    sub-float v8, v7, v1

    sub-float v9, v3, v1

    float-to-double v10, v4

    float-to-double v12, v6

    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    mul-double/2addr v12, v14

    sub-double v12, v10, v12

    float-to-double v14, v8

    add-double/2addr v12, v14

    const-wide/high16 v14, 0x4008000000000000L    # 3.0

    mul-double/2addr v12, v14

    sub-float v3, v6, v4

    float-to-double v2, v3

    mul-double/2addr v2, v14

    neg-float v4, v4

    float-to-double v14, v4

    sub-float/2addr v6, v8

    move v4, v7

    float-to-double v6, v6

    const-wide/high16 v18, 0x4008000000000000L    # 3.0

    mul-double v6, v6, v18

    add-double/2addr v6, v14

    float-to-double v8, v9

    add-double/2addr v6, v8

    const-wide/16 v8, 0x0

    sub-double v14, v6, v8

    invoke-static {v14, v15}, Ljava/lang/Math;->abs(D)D

    move-result-wide v14

    const-wide v20, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v14, v14, v20

    const v15, 0x3f800007    # 1.0000008f

    const/high16 v22, -0x4aa00000

    const/high16 v23, 0x7fc00000    # Float.NaN

    if-gez v14, :cond_9

    sub-double v6, v12, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    cmpg-double v6, v6, v20

    if-gez v6, :cond_3

    sub-double v6, v2, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    cmpg-double v6, v6, v20

    if-gez v6, :cond_0

    goto/16 :goto_7

    :cond_0
    neg-double v6, v10

    div-double/2addr v6, v2

    double-to-float v2, v6

    const/4 v3, 0x0

    cmpg-float v6, v2, v3

    if-gez v6, :cond_1

    cmpl-float v2, v2, v22

    if-ltz v2, :cond_1d

    :goto_0
    const/16 v23, 0x0

    goto/16 :goto_7

    :cond_1
    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v6, v2, v3

    if-lez v6, :cond_2

    cmpg-float v2, v2, v15

    if-gtz v2, :cond_1d

    :goto_1
    const/high16 v23, 0x3f800000    # 1.0f

    goto/16 :goto_7

    :cond_2
    move/from16 v23, v2

    goto/16 :goto_7

    :cond_3
    mul-double v6, v2, v2

    const-wide/high16 v8, 0x4010000000000000L    # 4.0

    mul-double/2addr v8, v12

    mul-double/2addr v8, v10

    sub-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    mul-double/2addr v12, v8

    sub-double v8, v6, v2

    div-double/2addr v8, v12

    double-to-float v8, v8

    const/4 v9, 0x0

    cmpg-float v10, v8, v9

    if-gez v10, :cond_5

    cmpl-float v8, v8, v22

    if-ltz v8, :cond_4

    const/4 v8, 0x0

    goto :goto_2

    :cond_4
    move/from16 v8, v23

    goto :goto_2

    :cond_5
    const/high16 v9, 0x3f800000    # 1.0f

    cmpl-float v10, v8, v9

    if-lez v10, :cond_6

    cmpg-float v8, v8, v15

    if-gtz v8, :cond_4

    const/high16 v8, 0x3f800000    # 1.0f

    :cond_6
    :goto_2
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-nez v9, :cond_7

    :goto_3
    move/from16 v23, v8

    goto/16 :goto_7

    :cond_7
    neg-double v2, v2

    sub-double/2addr v2, v6

    div-double/2addr v2, v12

    double-to-float v2, v2

    const/4 v3, 0x0

    cmpg-float v6, v2, v3

    if-gez v6, :cond_8

    cmpl-float v2, v2, v22

    if-ltz v2, :cond_1d

    goto :goto_0

    :cond_8
    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v6, v2, v3

    if-lez v6, :cond_2

    cmpg-float v2, v2, v15

    if-gtz v2, :cond_1d

    goto :goto_1

    :cond_9
    div-double/2addr v12, v6

    div-double/2addr v2, v6

    div-double/2addr v10, v6

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    mul-double v20, v2, v6

    mul-double v6, v12, v12

    sub-double v20, v20, v6

    const-wide/high16 v6, 0x4022000000000000L    # 9.0

    div-double v20, v20, v6

    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    mul-double v16, v16, v12

    mul-double v16, v16, v12

    mul-double v16, v16, v12

    mul-double/2addr v6, v12

    mul-double/2addr v6, v2

    sub-double v16, v16, v6

    const-wide/high16 v2, 0x403b000000000000L    # 27.0

    mul-double/2addr v10, v2

    add-double v10, v10, v16

    const-wide/high16 v2, 0x404b000000000000L    # 54.0

    div-double/2addr v10, v2

    mul-double v2, v10, v10

    mul-double v6, v20, v20

    mul-double v6, v6, v20

    add-double/2addr v2, v6

    const-wide/high16 v16, 0x4008000000000000L    # 3.0

    div-double v12, v12, v16

    cmpg-double v8, v2, v8

    const/high16 v9, 0x40000000    # 2.0f

    if-gez v8, :cond_15

    neg-double v2, v6

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    neg-double v6, v10

    div-double/2addr v6, v2

    const-wide/high16 v10, -0x4010000000000000L    # -1.0

    cmpg-double v8, v6, v10

    if-gez v8, :cond_a

    move-wide v6, v10

    :cond_a
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    cmpl-double v8, v6, v10

    if-lez v8, :cond_b

    move-wide v6, v10

    :cond_b
    invoke-static {v6, v7}, Ljava/lang/Math;->acos(D)D

    move-result-wide v6

    double-to-float v2, v2

    invoke-static {v2}, Lr2/a;->w(F)F

    move-result v2

    mul-float/2addr v2, v9

    float-to-double v2, v2

    const-wide/high16 v8, 0x4008000000000000L    # 3.0

    div-double v10, v6, v8

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    mul-double/2addr v8, v2

    sub-double/2addr v8, v12

    double-to-float v8, v8

    const/4 v9, 0x0

    cmpg-float v10, v8, v9

    if-gez v10, :cond_d

    cmpl-float v8, v8, v22

    if-ltz v8, :cond_c

    const/4 v8, 0x0

    goto :goto_4

    :cond_c
    move/from16 v8, v23

    goto :goto_4

    :cond_d
    const/high16 v9, 0x3f800000    # 1.0f

    cmpl-float v10, v8, v9

    if-lez v10, :cond_e

    cmpg-float v8, v8, v15

    if-gtz v8, :cond_c

    const/high16 v8, 0x3f800000    # 1.0f

    :cond_e
    :goto_4
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-nez v9, :cond_f

    goto/16 :goto_3

    :cond_f
    const-wide v8, 0x401921fb54442d18L    # 6.283185307179586

    add-double/2addr v8, v6

    const-wide/high16 v10, 0x4008000000000000L    # 3.0

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    mul-double/2addr v8, v2

    sub-double/2addr v8, v12

    double-to-float v8, v8

    const/4 v9, 0x0

    cmpg-float v10, v8, v9

    if-gez v10, :cond_11

    cmpl-float v8, v8, v22

    if-ltz v8, :cond_10

    const/4 v8, 0x0

    goto :goto_5

    :cond_10
    move/from16 v8, v23

    goto :goto_5

    :cond_11
    const/high16 v9, 0x3f800000    # 1.0f

    cmpl-float v10, v8, v9

    if-lez v10, :cond_12

    cmpg-float v8, v8, v15

    if-gtz v8, :cond_10

    const/high16 v8, 0x3f800000    # 1.0f

    :cond_12
    :goto_5
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-nez v9, :cond_13

    goto/16 :goto_3

    :cond_13
    const-wide v8, 0x402921fb54442d18L    # 12.566370614359172

    add-double/2addr v6, v8

    const-wide/high16 v8, 0x4008000000000000L    # 3.0

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    mul-double/2addr v6, v2

    sub-double/2addr v6, v12

    double-to-float v2, v6

    const/4 v3, 0x0

    cmpg-float v6, v2, v3

    if-gez v6, :cond_14

    cmpl-float v2, v2, v22

    if-ltz v2, :cond_1d

    goto/16 :goto_0

    :cond_14
    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v6, v2, v3

    if-lez v6, :cond_2

    cmpg-float v2, v2, v15

    if-gtz v2, :cond_1d

    goto/16 :goto_1

    :cond_15
    if-nez v8, :cond_1b

    double-to-float v2, v10

    invoke-static {v2}, Lr2/a;->w(F)F

    move-result v2

    neg-float v2, v2

    mul-float/2addr v9, v2

    double-to-float v3, v12

    sub-float v6, v9, v3

    const/4 v7, 0x0

    cmpg-float v8, v6, v7

    if-gez v8, :cond_17

    cmpl-float v6, v6, v22

    if-ltz v6, :cond_16

    const/4 v6, 0x0

    goto :goto_6

    :cond_16
    move/from16 v6, v23

    goto :goto_6

    :cond_17
    const/high16 v7, 0x3f800000    # 1.0f

    cmpl-float v8, v6, v7

    if-lez v8, :cond_18

    cmpg-float v6, v6, v15

    if-gtz v6, :cond_16

    const/high16 v6, 0x3f800000    # 1.0f

    :cond_18
    :goto_6
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_19

    move/from16 v23, v6

    goto :goto_7

    :cond_19
    neg-float v2, v2

    sub-float/2addr v2, v3

    const/4 v3, 0x0

    cmpg-float v6, v2, v3

    if-gez v6, :cond_1a

    cmpl-float v2, v2, v22

    if-ltz v2, :cond_1d

    goto/16 :goto_0

    :cond_1a
    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v6, v2, v3

    if-lez v6, :cond_2

    cmpg-float v2, v2, v15

    if-gtz v2, :cond_1d

    goto/16 :goto_1

    :cond_1b
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    neg-double v6, v10

    add-double/2addr v6, v2

    double-to-float v6, v6

    invoke-static {v6}, Lr2/a;->w(F)F

    move-result v6

    add-double/2addr v10, v2

    double-to-float v2, v10

    invoke-static {v2}, Lr2/a;->w(F)F

    move-result v2

    sub-float/2addr v6, v2

    float-to-double v2, v6

    sub-double/2addr v2, v12

    double-to-float v2, v2

    const/4 v3, 0x0

    cmpg-float v6, v2, v3

    if-gez v6, :cond_1c

    cmpl-float v2, v2, v22

    if-ltz v2, :cond_1d

    goto/16 :goto_0

    :cond_1c
    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v6, v2, v3

    if-lez v6, :cond_2

    cmpg-float v2, v2, v15

    if-gtz v2, :cond_1d

    goto/16 :goto_1

    :cond_1d
    :goto_7
    invoke-static/range {v23 .. v23}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_1f

    const v1, -0x40d55556

    mul-float v1, v1, v23

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v1, v2

    mul-float v1, v1, v23

    const/4 v2, 0x0

    add-float/2addr v1, v2

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v1, v2

    mul-float v1, v1, v23

    iget v2, v0, Lp/q;->c:F

    cmpg-float v3, v1, v2

    if-gez v3, :cond_1e

    move v1, v2

    :cond_1e
    iget v2, v0, Lp/q;->d:F

    cmpl-float v3, v1, v2

    if-lez v3, :cond_20

    move v1, v2

    goto :goto_8

    :cond_1f
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "The cubic curve with parameters ("

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v5, ", 0.0, "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, ", 1.0) has no solution at "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_20
    :goto_8
    return v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lp/q;

    if-eqz v0, :cond_0

    check-cast p1, Lp/q;

    iget v0, p1, Lp/q;->a:F

    iget v1, p0, Lp/q;->a:F

    cmpg-float v0, v1, v0

    if-nez v0, :cond_0

    iget v0, p0, Lp/q;->b:F

    iget p1, p1, Lp/q;->b:F

    cmpg-float p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lp/q;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lp/f;->a(FII)I

    move-result v0

    iget v2, p0, Lp/q;->b:F

    invoke-static {v2, v0, v1}, Lp/f;->a(FII)I

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CubicBezierEasing(a="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lp/q;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", b=0.0, c="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lp/q;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", d=1.0)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
