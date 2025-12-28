.class public final Lp/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/t;


# instance fields
.field public final a:F

.field public final b:Lp/z;


# direct methods
.method public constructor <init>(FFF)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lp/u;->a:F

    new-instance p3, Lp/z;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p3, Lp/z;->a:F

    const-wide/high16 v1, 0x4049000000000000L    # 50.0

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    iput-wide v1, p3, Lp/z;->b:D

    iput v0, p3, Lp/z;->g:F

    const/4 v0, 0x0

    cmpg-float v3, p1, v0

    if-ltz v3, :cond_1

    iput p1, p3, Lp/z;->g:F

    const/4 p1, 0x0

    iput-boolean p1, p3, Lp/z;->c:Z

    mul-double/2addr v1, v1

    double-to-float v1, v1

    cmpg-float v0, v1, v0

    if-lez v0, :cond_0

    float-to-double v0, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, p3, Lp/z;->b:D

    iput-boolean p1, p3, Lp/z;->c:Z

    iput-object p3, p0, Lp/u;->b:Lp/z;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Spring stiffness constant must be positive."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Damping ratio must be non-negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b(JFFF)F
    .locals 2

    const-wide/32 v0, 0xf4240

    div-long/2addr p1, v0

    iget-object v0, p0, Lp/u;->b:Lp/z;

    iput p4, v0, Lp/z;->a:F

    invoke-virtual {v0, p3, p5, p1, p2}, Lp/z;->a(FFJ)J

    move-result-wide p1

    const/16 p3, 0x20

    shr-long/2addr p1, p3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1
.end method

.method public final c(JFFF)F
    .locals 2

    const-wide/32 v0, 0xf4240

    div-long/2addr p1, v0

    iget-object v0, p0, Lp/u;->b:Lp/z;

    iput p4, v0, Lp/z;->a:F

    invoke-virtual {v0, p3, p5, p1, p2}, Lp/z;->a(FFJ)J

    move-result-wide p1

    const-wide p3, 0xffffffffL

    and-long/2addr p1, p3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1
.end method

.method public final d(FFF)J
    .locals 30

    move-object/from16 v0, p0

    iget-object v1, v0, Lp/u;->b:Lp/z;

    iget-wide v2, v1, Lp/z;->b:D

    mul-double/2addr v2, v2

    double-to-float v2, v2

    iget v1, v1, Lp/z;->g:F

    sub-float v3, p1, p2

    iget v4, v0, Lp/u;->a:F

    div-float/2addr v3, v4

    div-float v4, p3, v4

    const/4 v5, 0x0

    cmpg-float v5, v1, v5

    if-nez v5, :cond_0

    const-wide v1, 0x8637bd05af6L

    goto/16 :goto_f

    :cond_0
    float-to-double v5, v2

    float-to-double v1, v1

    float-to-double v7, v4

    float-to-double v3, v3

    const/high16 v9, 0x3f800000    # 1.0f

    float-to-double v9, v9

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    mul-double v13, v1, v11

    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v15

    mul-double/2addr v13, v15

    mul-double v15, v13, v13

    const-wide/high16 v17, 0x4010000000000000L    # 4.0

    mul-double v5, v5, v17

    sub-double/2addr v15, v5

    neg-double v5, v13

    const-wide/16 v13, 0x0

    cmpg-double v17, v15, v13

    if-gez v17, :cond_1

    new-instance v11, Lp/p;

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(D)D

    move-result-wide v18

    move-wide/from16 v20, v9

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v9

    invoke-direct {v11, v13, v14, v9, v10}, Lp/p;-><init>(DD)V

    goto :goto_0

    :cond_1
    move-wide/from16 v20, v9

    new-instance v11, Lp/p;

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v9

    invoke-direct {v11, v9, v10, v13, v14}, Lp/p;-><init>(DD)V

    :goto_0
    iget-wide v9, v11, Lp/p;->a:D

    add-double/2addr v9, v5

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    mul-double v9, v9, v18

    iput-wide v9, v11, Lp/p;->a:D

    iget-wide v9, v11, Lp/p;->b:D

    mul-double v9, v9, v18

    iput-wide v9, v11, Lp/p;->b:D

    if-gez v17, :cond_2

    new-instance v9, Lp/p;

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(D)D

    move-result-wide v15

    move-object v12, v11

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    invoke-direct {v9, v13, v14, v10, v11}, Lp/p;-><init>(DD)V

    goto :goto_1

    :cond_2
    move-object v12, v11

    new-instance v9, Lp/p;

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    invoke-direct {v9, v10, v11, v13, v14}, Lp/p;-><init>(DD)V

    :goto_1
    iget-wide v10, v9, Lp/p;->a:D

    const/4 v15, -0x1

    int-to-double v13, v15

    mul-double/2addr v10, v13

    move-wide/from16 v22, v1

    iget-wide v0, v9, Lp/p;->b:D

    mul-double/2addr v0, v13

    add-double/2addr v10, v5

    mul-double v10, v10, v18

    iput-wide v10, v9, Lp/p;->a:D

    mul-double v0, v0, v18

    iput-wide v0, v9, Lp/p;->b:D

    const-wide/16 v0, 0x0

    cmpg-double v2, v3, v0

    if-nez v2, :cond_3

    cmpg-double v5, v7, v0

    if-nez v5, :cond_3

    const-wide/16 v0, 0x0

    :goto_2
    move-wide v1, v0

    goto/16 :goto_f

    :cond_3
    if-gez v2, :cond_4

    neg-double v7, v7

    :cond_4
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v22, v2

    if-lez v4, :cond_c

    move-object v4, v12

    iget-wide v2, v4, Lp/p;->a:D

    iget-wide v13, v9, Lp/p;->a:D

    mul-double v22, v2, v0

    sub-double v22, v22, v7

    sub-double v7, v2, v13

    div-double v5, v22, v7

    sub-double/2addr v0, v5

    div-double v22, v20, v0

    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->abs(D)D

    move-result-wide v22

    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->log(D)D

    move-result-wide v22

    div-double v9, v22, v2

    div-double v22, v20, v5

    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->abs(D)D

    move-result-wide v22

    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->log(D)D

    move-result-wide v22

    div-double v11, v22, v13

    invoke-static {v9, v10}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-static {v11, v12}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v4

    if-nez v4, :cond_6

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    move-result v4

    if-nez v4, :cond_6

    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->max(DD)D

    move-result-wide v9

    goto :goto_3

    :cond_5
    move-wide v9, v11

    :cond_6
    :goto_3
    mul-double v11, v0, v2

    move-wide/from16 p1, v9

    neg-double v9, v5

    mul-double/2addr v9, v13

    div-double v9, v11, v9

    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    move-result-wide v9

    sub-double v22, v13, v2

    div-double v9, v9, v22

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    move-result v4

    if-nez v4, :cond_7

    const-wide/16 v16, 0x0

    cmpg-double v4, v9, v16

    if-gtz v4, :cond_8

    :cond_7
    move-wide/from16 v9, v20

    move-wide/from16 v20, v0

    goto :goto_5

    :cond_8
    cmpl-double v4, v9, v16

    if-lez v4, :cond_a

    mul-double v22, v2, v9

    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->exp(D)D

    move-result-wide v22

    mul-double v22, v22, v0

    mul-double/2addr v9, v13

    invoke-static {v9, v10}, Ljava/lang/Math;->exp(D)D

    move-result-wide v9

    mul-double/2addr v9, v5

    add-double v9, v9, v22

    neg-double v9, v9

    cmpg-double v4, v9, v20

    if-gez v4, :cond_a

    const-wide/16 v9, 0x0

    cmpl-double v4, v5, v9

    if-lez v4, :cond_9

    cmpg-double v4, v0, v9

    if-gez v4, :cond_9

    move-wide/from16 v9, v20

    const-wide/16 v16, 0x0

    goto :goto_4

    :cond_9
    move-wide/from16 v16, p1

    move-wide/from16 v9, v20

    :goto_4
    neg-double v9, v9

    move-wide/from16 v20, v0

    goto :goto_6

    :cond_a
    move-wide/from16 v9, v20

    mul-double v16, v5, v13

    move-wide/from16 v20, v0

    mul-double v0, v16, v13

    neg-double v0, v0

    mul-double v16, v11, v2

    div-double v0, v0, v16

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    div-double/2addr v0, v7

    move-wide/from16 v16, v0

    goto :goto_6

    :goto_5
    neg-double v9, v9

    move-wide/from16 v16, p1

    :goto_6
    mul-double v0, v2, v16

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide v0

    mul-double/2addr v0, v11

    mul-double v7, v5, v13

    mul-double v22, v13, v16

    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->exp(D)D

    move-result-wide v22

    mul-double v22, v22, v7

    add-double v22, v22, v0

    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v22, 0x3f1a36e2eb1c432dL    # 1.0E-4

    cmpg-double v0, v0, v22

    if-gez v0, :cond_b

    goto/16 :goto_e

    :cond_b
    const-wide v0, 0x3f50624dd2f1a9fcL    # 0.001

    const/4 v15, 0x0

    const-wide v18, 0x7fefffffffffffffL    # Double.MAX_VALUE

    :goto_7
    cmpl-double v4, v18, v0

    if-lez v4, :cond_15

    const/16 v0, 0x64

    if-ge v15, v0, :cond_15

    add-int/lit8 v15, v15, 0x1

    mul-double v0, v2, v16

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide v18

    mul-double v18, v18, v20

    mul-double v22, v13, v16

    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->exp(D)D

    move-result-wide v24

    mul-double v24, v24, v5

    add-double v24, v24, v18

    add-double v24, v24, v9

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide v0

    mul-double/2addr v0, v11

    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->exp(D)D

    move-result-wide v18

    mul-double v18, v18, v7

    add-double v18, v18, v0

    div-double v24, v24, v18

    sub-double v0, v16, v24

    sub-double v16, v16, v0

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->abs(D)D

    move-result-wide v18

    move-wide/from16 v16, v0

    const-wide v0, 0x3f50624dd2f1a9fcL    # 0.001

    goto :goto_7

    :cond_c
    move-object v4, v12

    move-wide/from16 v9, v20

    cmpg-double v2, v22, v2

    if-gez v2, :cond_d

    iget-wide v2, v4, Lp/p;->a:D

    mul-double v5, v2, v0

    sub-double/2addr v7, v5

    iget-wide v4, v4, Lp/p;->b:D

    div-double/2addr v7, v4

    mul-double/2addr v0, v0

    mul-double/2addr v7, v7

    add-double/2addr v7, v0

    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    div-double/2addr v9, v0

    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    div-double v16, v0, v2

    goto/16 :goto_e

    :cond_d
    iget-wide v2, v4, Lp/p;->a:D

    mul-double v4, v2, v0

    sub-double/2addr v7, v4

    div-double v11, v9, v0

    invoke-static {v11, v12}, Ljava/lang/Math;->abs(D)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Math;->log(D)D

    move-result-wide v11

    div-double/2addr v11, v2

    div-double v13, v9, v7

    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Math;->log(D)D

    move-result-wide v13

    move-wide/from16 v20, v13

    const/4 v6, 0x0

    :goto_8
    const/4 v15, 0x6

    if-ge v6, v15, :cond_e

    div-double v20, v20, v2

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->abs(D)D

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->log(D)D

    move-result-wide v20

    sub-double v20, v13, v20

    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_e
    div-double v13, v20, v2

    invoke-static {v11, v12}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v6

    if-nez v6, :cond_f

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    move-result v6

    if-nez v6, :cond_f

    invoke-static {v13, v14}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v6

    if-nez v6, :cond_10

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    move-result v6

    if-nez v6, :cond_10

    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->max(DD)D

    move-result-wide v11

    goto :goto_9

    :cond_f
    move-wide v11, v13

    :cond_10
    :goto_9
    add-double v13, v4, v7

    neg-double v13, v13

    mul-double v20, v2, v7

    div-double v13, v13, v20

    mul-double v20, v2, v13

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->exp(D)D

    move-result-wide v24

    mul-double v24, v24, v0

    mul-double v26, v7, v13

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->exp(D)D

    move-result-wide v20

    mul-double v20, v20, v26

    move-wide/from16 v26, v11

    add-double v11, v20, v24

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    move-result v6

    if-nez v6, :cond_14

    const-wide/16 v15, 0x0

    cmpg-double v6, v13, v15

    if-gtz v6, :cond_11

    goto :goto_b

    :cond_11
    cmpl-double v6, v13, v15

    if-lez v6, :cond_13

    neg-double v11, v11

    cmpg-double v6, v11, v9

    if-gez v6, :cond_13

    cmpg-double v6, v7, v15

    if-gez v6, :cond_12

    cmpl-double v6, v0, v15

    if-lez v6, :cond_12

    move-wide v13, v15

    goto :goto_a

    :cond_12
    move-wide/from16 v13, v26

    :goto_a
    neg-double v9, v9

    move-wide v11, v13

    goto :goto_c

    :cond_13
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    div-double/2addr v11, v2

    neg-double v11, v11

    div-double v13, v0, v7

    sub-double/2addr v11, v13

    goto :goto_c

    :cond_14
    :goto_b
    neg-double v9, v9

    move-wide/from16 v11, v26

    :goto_c
    move-wide/from16 v16, v11

    const/4 v6, 0x0

    const-wide v11, 0x3f50624dd2f1a9fcL    # 0.001

    const-wide v13, 0x7fefffffffffffffL    # Double.MAX_VALUE

    :goto_d
    cmpl-double v13, v13, v11

    if-lez v13, :cond_15

    const/16 v13, 0x64

    if-ge v6, v13, :cond_15

    add-int/lit8 v6, v6, 0x1

    mul-double v14, v7, v16

    add-double/2addr v14, v0

    mul-double v18, v2, v16

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->exp(D)D

    move-result-wide v20

    mul-double v20, v20, v14

    add-double v20, v20, v9

    const/4 v14, 0x1

    int-to-double v14, v14

    add-double v14, v18, v14

    mul-double/2addr v14, v7

    add-double/2addr v14, v4

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->exp(D)D

    move-result-wide v18

    mul-double v18, v18, v14

    div-double v20, v20, v18

    sub-double v14, v16, v20

    sub-double v16, v16, v14

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->abs(D)D

    move-result-wide v16

    move-wide/from16 v28, v14

    move-wide/from16 v13, v16

    move-wide/from16 v16, v28

    goto :goto_d

    :cond_15
    :goto_e
    const-wide v0, 0x408f400000000000L    # 1000.0

    mul-double v0, v0, v16

    double-to-long v0, v0

    goto/16 :goto_2

    :goto_f
    const-wide/32 v3, 0xf4240

    mul-long/2addr v1, v3

    return-wide v1
.end method

.method public final e(FFF)F
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
