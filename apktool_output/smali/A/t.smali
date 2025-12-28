.class public LA/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB2/e;
.implements Le1/s;
.implements LN1/a;
.implements Ld1/o;
.implements Ld1/c;
.implements Ld1/e;
.implements Lk/n0;
.implements Lj/o;


# instance fields
.field public final synthetic d:I

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, LA/t;->d:I

    sparse-switch p1, :sswitch_data_0

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/t;->e:Ljava/lang/Object;

    return-void

    .line 15
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance p1, Ln/m;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ln/m;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LA/t;->e:Ljava/lang/Object;

    return-void

    .line 17
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance p1, LF/d;

    const/16 v0, 0x10

    new-array v0, v0, [Lh0/e;

    invoke-direct {p1, v0}, LF/d;-><init>([Ljava/lang/Object;)V

    .line 19
    iput-object p1, p0, LA/t;->e:Ljava/lang/Object;

    return-void

    .line 20
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance p1, Le1/k;

    .line 22
    invoke-direct {p1, p0}, Le1/k;-><init>(LA/t;)V

    .line 23
    iput-object p1, p0, LA/t;->e:Ljava/lang/Object;

    return-void

    .line 24
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    sget-object p1, Ln/D;->a:[J

    .line 26
    new-instance p1, Ln/y;

    invoke-direct {p1}, Ln/y;-><init>()V

    .line 27
    iput-object p1, p0, LA/t;->e:Ljava/lang/Object;

    return-void

    .line 28
    :sswitch_4
    new-instance p1, Landroid/util/SparseArray;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Landroid/util/SparseArray;-><init>(I)V

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, LA/t;->e:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_4
        0x7 -> :sswitch_3
        0x15 -> :sswitch_2
        0x16 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LA/t;->d:I

    iput-object p2, p0, LA/t;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 2
    iput p1, p0, LA/t;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, LA/t;->d:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-static {p1, p2}, LM1/a;->e(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, LA/t;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, LA/t;->d:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    invoke-static {p1}, LM1/a;->g(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, LA/t;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    const/16 p1, 0x14

    iput p1, p0, LA/t;->d:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, LA/t;->e:Ljava/lang/Object;

    .line 5
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-void
.end method

.method public constructor <init>(Lo2/e;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LA/t;->d:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    check-cast p1, Li2/j;

    iput-object p1, p0, LA/t;->e:Ljava/lang/Object;

    return-void
.end method

.method public static A(LA/t;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v5, 0x0

    :goto_0
    const/16 v6, 0x20

    if-ge v5, v3, :cond_0

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7, v6}, Lp2/g;->f(II)I

    move-result v7

    if-gtz v7, :cond_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-le v3, v5, :cond_1

    add-int/lit8 v7, v3, -0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7, v6}, Lp2/g;->f(II)I

    move-result v7

    if-gtz v7, :cond_1

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_2
    if-ge v5, v3, :cond_56

    :goto_3
    add-int/lit8 v8, v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    or-int/lit8 v9, v5, 0x20

    add-int/lit8 v10, v9, -0x61

    add-int/lit8 v11, v9, -0x7a

    mul-int/2addr v11, v10

    const/16 v10, 0x65

    if-gtz v11, :cond_2

    if-eq v9, v10, :cond_2

    goto :goto_4

    :cond_2
    if-lt v8, v3, :cond_55

    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_54

    or-int/lit8 v9, v5, 0x20

    const/16 v11, 0x7a

    if-eq v9, v11, :cond_39

    const/4 v7, 0x0

    :goto_5
    if-ge v8, v3, :cond_3

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9, v6}, Lp2/g;->f(II)I

    move-result v9

    if-gtz v9, :cond_3

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_3
    const-wide v14, 0xffffffffL

    const/high16 v9, 0x7fc00000    # Float.NaN

    if-ne v8, v3, :cond_4

    move/from16 v17, v5

    int-to-long v4, v8

    shl-long/2addr v4, v6

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    :goto_6
    int-to-long v8, v8

    and-long/2addr v8, v14

    or-long/2addr v4, v8

    move-object/from16 v33, v2

    move v9, v3

    move v2, v6

    move/from16 v32, v7

    move-wide v7, v14

    goto/16 :goto_24

    :cond_4
    move/from16 v17, v5

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x2d

    if-ne v4, v5, :cond_5

    const/16 v18, 0x1

    goto :goto_7

    :cond_5
    const/16 v18, 0x0

    :goto_7
    const/16 v13, 0xa

    const/16 v11, 0x2e

    if-eqz v18, :cond_8

    add-int/lit8 v4, v8, 0x1

    if-ne v4, v3, :cond_6

    int-to-long v4, v4

    shl-long/2addr v4, v6

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    goto :goto_6

    :cond_6
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v12

    add-int/lit8 v5, v12, -0x30

    int-to-char v5, v5

    if-ge v5, v13, :cond_7

    goto :goto_8

    :cond_7
    if-eq v12, v11, :cond_9

    int-to-long v4, v4

    shl-long/2addr v4, v6

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    goto :goto_6

    :cond_8
    move v12, v4

    move v4, v8

    :cond_9
    :goto_8
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v5

    const-wide/16 v22, 0x0

    move v10, v4

    move-wide/from16 v25, v22

    :goto_9
    const-wide/16 v27, 0xa

    if-eq v10, v3, :cond_b

    add-int/lit8 v14, v12, -0x30

    int-to-char v15, v14

    if-ge v15, v13, :cond_b

    mul-long v25, v25, v27

    int-to-long v14, v14

    add-long v25, v25, v14

    add-int/lit8 v10, v10, 0x1

    if-ge v10, v5, :cond_a

    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v12

    goto :goto_a

    :cond_a
    const/4 v12, 0x0

    :goto_a
    const-wide v14, 0xffffffffL

    goto :goto_9

    :cond_b
    sub-int v14, v10, v4

    const/16 v15, 0x30

    const/16 v29, 0x10

    if-eq v10, v3, :cond_11

    if-ne v12, v11, :cond_11

    add-int/lit8 v12, v10, 0x1

    move v11, v12

    :goto_b
    sub-int v9, v3, v11

    const/4 v13, 0x4

    if-lt v9, v13, :cond_d

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v9

    move/from16 v32, v7

    int-to-long v6, v9

    add-int/lit8 v9, v11, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    move/from16 v33, v14

    int-to-long v13, v9

    shl-long v13, v13, v29

    or-long/2addr v6, v13

    add-int/lit8 v9, v11, 0x2

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    int-to-long v13, v9

    const/16 v9, 0x20

    shl-long v34, v13, v9

    or-long v6, v6, v34

    add-int/lit8 v9, v11, 0x3

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    int-to-long v13, v9

    shl-long/2addr v13, v15

    or-long/2addr v6, v13

    const-wide v13, 0x30003000300030L

    sub-long v13, v6, v13

    const-wide v35, 0x46004600460046L    # 2.447700077935472E-307

    add-long v6, v6, v35

    or-long/2addr v6, v13

    const-wide v35, -0x7f007f007f0080L

    and-long v6, v6, v35

    cmp-long v6, v6, v22

    if-eqz v6, :cond_c

    const/4 v6, -0x1

    goto :goto_c

    :cond_c
    const-wide v6, 0x3e80064000a0001L

    mul-long/2addr v13, v6

    ushr-long v6, v13, v15

    long-to-int v6, v6

    :goto_c
    if-ltz v6, :cond_e

    const-wide/16 v13, 0x2710

    mul-long v25, v25, v13

    int-to-long v6, v6

    add-long v25, v25, v6

    add-int/lit8 v11, v11, 0x4

    move/from16 v7, v32

    move/from16 v14, v33

    const/16 v6, 0x20

    const/16 v13, 0xa

    goto :goto_b

    :cond_d
    move/from16 v32, v7

    move/from16 v33, v14

    :cond_e
    if-ge v11, v5, :cond_f

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v6

    goto :goto_d

    :cond_f
    const/4 v6, 0x0

    :goto_d
    if-eq v11, v3, :cond_10

    add-int/lit8 v7, v6, -0x30

    int-to-char v9, v7

    const/16 v13, 0xa

    if-ge v9, v13, :cond_10

    mul-long v25, v25, v27

    int-to-long v6, v7

    add-long v25, v25, v6

    add-int/lit8 v11, v11, 0x1

    if-ge v11, v5, :cond_f

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v6

    goto :goto_d

    :cond_10
    sub-int v7, v12, v11

    sub-int v14, v33, v7

    move/from16 v37, v12

    move v12, v6

    move/from16 v6, v37

    goto :goto_e

    :cond_11
    move/from16 v32, v7

    move/from16 v33, v14

    move v6, v10

    move v11, v6

    move/from16 v14, v33

    const/4 v7, 0x0

    :goto_e
    if-nez v14, :cond_12

    int-to-long v4, v11

    const/16 v9, 0x20

    shl-long/2addr v4, v9

    const/high16 v6, 0x7fc00000    # Float.NaN

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    const-wide v10, 0xffffffffL

    and-long/2addr v6, v10

    or-long/2addr v4, v6

    move-object/from16 v33, v2

    move v2, v9

    const-wide v7, 0xffffffffL

    move v9, v3

    goto/16 :goto_24

    :cond_12
    const/16 v9, 0x20

    or-int/2addr v12, v9

    const/16 v13, 0x65

    if-ne v12, v13, :cond_1c

    add-int/lit8 v12, v11, 0x1

    if-ge v12, v5, :cond_13

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v24

    move/from16 v13, v24

    const/16 v9, 0x2d

    goto :goto_f

    :cond_13
    const/16 v9, 0x2d

    const/4 v13, 0x0

    :goto_f
    if-ne v13, v9, :cond_14

    const/4 v9, 0x1

    goto :goto_10

    :cond_14
    const/4 v9, 0x0

    :goto_10
    if-nez v9, :cond_15

    const/16 v15, 0x2b

    if-ne v13, v15, :cond_16

    :cond_15
    add-int/lit8 v12, v11, 0x2

    :cond_16
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/4 v15, 0x0

    :goto_11
    if-eq v12, v3, :cond_19

    const/16 v31, 0x30

    add-int/lit8 v13, v13, -0x30

    move-object/from16 v33, v2

    int-to-char v2, v13

    const/16 v0, 0xa

    if-ge v2, v0, :cond_1a

    const/16 v2, 0x400

    if-ge v15, v2, :cond_17

    mul-int/lit8 v15, v15, 0xa

    add-int/2addr v15, v13

    :cond_17
    add-int/lit8 v12, v12, 0x1

    if-ge v12, v5, :cond_18

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v2

    move v13, v2

    goto :goto_12

    :cond_18
    const/4 v13, 0x0

    :goto_12
    move-object/from16 v0, p0

    move-object/from16 v2, v33

    goto :goto_11

    :cond_19
    move-object/from16 v33, v2

    :cond_1a
    if-eqz v9, :cond_1b

    neg-int v0, v15

    move v15, v0

    :cond_1b
    add-int/2addr v7, v15

    goto :goto_13

    :cond_1c
    move-object/from16 v33, v2

    move v12, v11

    const/4 v15, 0x0

    :goto_13
    const/16 v0, 0x13

    if-le v14, v0, :cond_27

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v2

    move v9, v4

    :goto_14
    if-eq v12, v3, :cond_21

    const/16 v13, 0x30

    const/16 v0, 0x2e

    if-eq v2, v13, :cond_1e

    if-ne v2, v0, :cond_1d

    goto :goto_15

    :cond_1d
    const/16 v0, 0x13

    goto :goto_17

    :cond_1e
    :goto_15
    if-ne v2, v13, :cond_1f

    add-int/lit8 v14, v14, -0x1

    :cond_1f
    const/4 v2, 0x1

    add-int/2addr v9, v2

    if-ge v9, v5, :cond_20

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v2

    goto :goto_16

    :cond_20
    const/4 v2, 0x0

    :goto_16
    const/16 v0, 0x13

    goto :goto_14

    :cond_21
    :goto_17
    if-le v14, v0, :cond_27

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    move v9, v3

    move-wide/from16 v13, v22

    :goto_18
    const-wide v2, 0xde0b6b3a7640000L

    if-eq v4, v10, :cond_23

    invoke-static {v13, v14, v2, v3}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v7

    if-gez v7, :cond_23

    mul-long v13, v13, v27

    const/16 v2, 0x30

    sub-int/2addr v0, v2

    int-to-long v2, v0

    add-long/2addr v13, v2

    add-int/lit8 v4, v4, 0x1

    if-ge v4, v5, :cond_22

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    goto :goto_18

    :cond_22
    const/4 v0, 0x0

    goto :goto_18

    :cond_23
    invoke-static {v13, v14, v2, v3}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v0

    if-ltz v0, :cond_24

    sub-int/2addr v10, v4

    add-int v7, v10, v15

    :goto_19
    const/4 v0, 0x1

    goto :goto_1c

    :cond_24
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v0

    move v4, v6

    :goto_1a
    if-eq v4, v11, :cond_26

    invoke-static {v13, v14, v2, v3}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v7

    if-gez v7, :cond_26

    mul-long v13, v13, v27

    const/16 v7, 0x30

    sub-int/2addr v0, v7

    int-to-long v2, v0

    add-long/2addr v13, v2

    add-int/lit8 v4, v4, 0x1

    if-ge v4, v5, :cond_25

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    goto :goto_1b

    :cond_25
    const/4 v0, 0x0

    :goto_1b
    const-wide v2, 0xde0b6b3a7640000L

    goto :goto_1a

    :cond_26
    sub-int/2addr v6, v4

    add-int v7, v6, v15

    goto :goto_19

    :cond_27
    move v9, v3

    move-wide/from16 v13, v25

    const/4 v0, 0x0

    :goto_1c
    const/16 v2, -0xa

    if-gt v2, v7, :cond_2a

    const/16 v2, 0xb

    if-ge v7, v2, :cond_2a

    if-nez v0, :cond_2a

    const-wide/32 v2, 0x1000000

    invoke-static {v13, v14, v2, v3}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v0

    if-gtz v0, :cond_2a

    long-to-float v0, v13

    sget-object v2, Lc0/b;->a:[F

    if-gez v7, :cond_28

    neg-int v3, v7

    aget v2, v2, v3

    div-float/2addr v0, v2

    goto :goto_1d

    :cond_28
    aget v2, v2, v7

    mul-float/2addr v0, v2

    :goto_1d
    if-eqz v18, :cond_29

    neg-float v0, v0

    :cond_29
    int-to-long v2, v12

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    :goto_1e
    int-to-long v5, v0

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    or-long/2addr v2, v5

    move-wide v4, v2

    :goto_1f
    const/16 v2, 0x20

    const-wide v7, 0xffffffffL

    goto/16 :goto_24

    :cond_2a
    cmp-long v0, v13, v22

    if-nez v0, :cond_2c

    if-eqz v18, :cond_2b

    const/high16 v0, -0x80000000

    goto :goto_20

    :cond_2b
    const/4 v0, 0x0

    :goto_20
    int-to-long v2, v12

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    goto :goto_1e

    :cond_2c
    const/16 v0, -0x7e

    const-string v2, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    if-gt v0, v7, :cond_33

    const/16 v0, 0x80

    if-ge v7, v0, :cond_33

    sget-object v0, Lc0/b;->b:[J

    add-int/lit16 v3, v7, 0x145

    aget-wide v5, v0, v3

    invoke-static {v13, v14}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    shl-long v10, v13, v0

    const-wide v13, 0xffffffffL

    and-long v25, v10, v13

    const/16 v3, 0x20

    ushr-long/2addr v10, v3

    and-long v27, v5, v13

    ushr-long v4, v5, v3

    mul-long v30, v10, v4

    mul-long v4, v4, v25

    mul-long v10, v10, v27

    mul-long v25, v25, v27

    ushr-long v25, v25, v3

    add-long v10, v10, v25

    and-long v25, v4, v13

    add-long v10, v10, v25

    ushr-long/2addr v10, v3

    add-long v30, v30, v10

    ushr-long/2addr v4, v3

    add-long v30, v30, v4

    const/16 v4, 0x3f

    ushr-long v5, v30, v4

    long-to-int v5, v5

    add-int/lit8 v6, v5, 0x9

    ushr-long v10, v30, v6

    const/4 v6, 0x1

    xor-int/2addr v5, v6

    add-int/2addr v0, v5

    const-wide/16 v5, 0x1ff

    and-long v13, v30, v5

    cmp-long v5, v13, v5

    if-eqz v5, :cond_2d

    cmp-long v5, v13, v22

    const-wide/16 v13, 0x1

    if-nez v5, :cond_2e

    const-wide/16 v5, 0x3

    and-long/2addr v5, v10

    cmp-long v5, v5, v13

    if-nez v5, :cond_2e

    :cond_2d
    const/16 v3, 0x20

    const-wide v10, 0xffffffffL

    goto :goto_23

    :cond_2e
    add-long/2addr v10, v13

    const/4 v5, 0x1

    ushr-long/2addr v10, v5

    const-wide/high16 v5, 0x20000000000000L

    cmp-long v5, v10, v5

    if-ltz v5, :cond_2f

    add-int/lit8 v0, v0, -0x1

    const-wide/high16 v10, 0x10000000000000L

    :cond_2f
    const-wide v5, -0x10000000000001L

    and-long/2addr v5, v10

    const-wide/32 v10, 0x3526a

    int-to-long v13, v7

    mul-long/2addr v13, v10

    shr-long v10, v13, v29

    const/16 v7, 0x400

    int-to-long v13, v7

    add-long/2addr v10, v13

    int-to-long v13, v4

    add-long/2addr v10, v13

    int-to-long v13, v0

    sub-long/2addr v10, v13

    const-wide/16 v13, 0x1

    cmp-long v0, v10, v13

    if-ltz v0, :cond_30

    const-wide/16 v13, 0x7fe

    cmp-long v0, v10, v13

    if-lez v0, :cond_31

    :cond_30
    const/16 v3, 0x20

    const-wide v10, 0xffffffffL

    goto :goto_22

    :cond_31
    const/16 v0, 0x34

    shl-long v7, v10, v0

    or-long v4, v5, v7

    if-eqz v18, :cond_32

    const-wide/high16 v22, -0x8000000000000000L

    :cond_32
    or-long v4, v4, v22

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    double-to-float v0, v4

    int-to-long v4, v12

    const/16 v3, 0x20

    shl-long/2addr v4, v3

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v6, v0

    const-wide v10, 0xffffffffL

    :goto_21
    and-long/2addr v6, v10

    or-long/2addr v4, v6

    move v2, v3

    move-wide v7, v10

    goto :goto_24

    :goto_22
    invoke-virtual {v1, v8, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    int-to-long v4, v12

    shl-long/2addr v4, v3

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v6, v0

    goto :goto_21

    :goto_23
    invoke-virtual {v1, v8, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    int-to-long v4, v12

    shl-long/2addr v4, v3

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v6, v0

    and-long/2addr v6, v10

    or-long/2addr v4, v6

    goto/16 :goto_1f

    :cond_33
    invoke-virtual {v1, v8, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    int-to-long v4, v12

    const/16 v2, 0x20

    shl-long v3, v4, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    or-long v4, v3, v5

    :goto_24
    ushr-long v10, v4, v2

    long-to-int v0, v10

    and-long v3, v4, v7

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_35

    move-object/from16 v4, p0

    iget-object v5, v4, LA/t;->e:Ljava/lang/Object;

    check-cast v5, [F

    add-int/lit8 v7, v32, 0x1

    aput v3, v5, v32

    array-length v6, v5

    if-lt v7, v6, :cond_34

    mul-int/lit8 v6, v7, 0x2

    new-array v6, v6, [F

    iput-object v6, v4, LA/t;->e:Ljava/lang/Object;

    array-length v8, v5

    const/4 v10, 0x0

    invoke-static {v5, v10, v6, v10, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_34
    move v8, v0

    goto :goto_25

    :cond_35
    move-object/from16 v4, p0

    move v8, v0

    move/from16 v7, v32

    :goto_25
    if-ge v8, v9, :cond_36

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v5, 0x2c

    if-ne v0, v5, :cond_36

    add-int/lit8 v8, v8, 0x1

    goto :goto_25

    :cond_36
    if-ge v8, v9, :cond_38

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_37

    goto :goto_26

    :cond_37
    move v6, v2

    move-object v0, v4

    move v3, v9

    move/from16 v5, v17

    move-object/from16 v2, v33

    const/16 v10, 0x65

    const/16 v11, 0x7a

    goto/16 :goto_5

    :cond_38
    :goto_26
    move v5, v8

    goto :goto_27

    :cond_39
    move-object v4, v0

    move-object/from16 v33, v2

    move v9, v3

    move/from16 v17, v5

    move v2, v6

    goto :goto_26

    :goto_27
    iget-object v0, v4, LA/t;->e:Ljava/lang/Object;

    check-cast v0, [F

    move/from16 v3, v17

    const/16 v6, 0x7a

    if-ne v3, v6, :cond_3a

    goto :goto_28

    :cond_3a
    const/16 v6, 0x5a

    if-ne v3, v6, :cond_3c

    :goto_28
    sget-object v0, Lc0/i;->c:Lc0/i;

    move-object/from16 v6, v33

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3b
    const/4 v11, 0x0

    goto/16 :goto_3f

    :cond_3c
    move-object/from16 v6, v33

    const/16 v8, 0x6d

    const/4 v10, 0x2

    if-ne v3, v8, :cond_3d

    add-int/lit8 v3, v7, -0x2

    if-ltz v3, :cond_3b

    new-instance v8, Lc0/u;

    const/4 v11, 0x0

    aget v12, v0, v11

    const/4 v11, 0x1

    aget v11, v0, v11

    invoke-direct {v8, v12, v11}, Lc0/u;-><init>(FF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_29
    if-gt v10, v3, :cond_3b

    new-instance v8, Lc0/t;

    aget v11, v0, v10

    add-int/lit8 v12, v10, 0x1

    aget v12, v0, v12

    invoke-direct {v8, v11, v12}, Lc0/t;-><init>(FF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x2

    goto :goto_29

    :cond_3d
    const/16 v8, 0x4d

    if-ne v3, v8, :cond_3e

    add-int/lit8 v3, v7, -0x2

    if-ltz v3, :cond_3b

    new-instance v8, Lc0/m;

    const/4 v11, 0x0

    aget v12, v0, v11

    const/4 v13, 0x1

    aget v13, v0, v13

    invoke-direct {v8, v12, v13}, Lc0/m;-><init>(FF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2a
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/l;

    aget v12, v0, v10

    add-int/lit8 v13, v10, 0x1

    aget v13, v0, v13

    invoke-direct {v8, v12, v13}, Lc0/l;-><init>(FF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x2

    goto :goto_2a

    :cond_3e
    const/4 v11, 0x0

    const/4 v13, 0x1

    const/16 v8, 0x6c

    if-ne v3, v8, :cond_3f

    add-int/lit8 v3, v7, -0x2

    move v10, v11

    :goto_2b
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/t;

    aget v12, v0, v10

    add-int/lit8 v13, v10, 0x1

    aget v13, v0, v13

    invoke-direct {v8, v12, v13}, Lc0/t;-><init>(FF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x2

    goto :goto_2b

    :cond_3f
    const/16 v8, 0x4c

    if-ne v3, v8, :cond_40

    add-int/lit8 v3, v7, -0x2

    move v10, v11

    :goto_2c
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/l;

    aget v12, v0, v10

    add-int/lit8 v13, v10, 0x1

    aget v13, v0, v13

    invoke-direct {v8, v12, v13}, Lc0/l;-><init>(FF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x2

    goto :goto_2c

    :cond_40
    const/16 v8, 0x68

    if-ne v3, v8, :cond_41

    add-int/lit8 v3, v7, -0x1

    move v10, v11

    :goto_2d
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/s;

    aget v12, v0, v10

    invoke-direct {v8, v12}, Lc0/s;-><init>(F)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_2d

    :cond_41
    const/16 v8, 0x48

    if-ne v3, v8, :cond_42

    add-int/lit8 v3, v7, -0x1

    move v10, v11

    :goto_2e
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/k;

    aget v12, v0, v10

    invoke-direct {v8, v12}, Lc0/k;-><init>(F)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_2e

    :cond_42
    const/16 v8, 0x76

    if-ne v3, v8, :cond_43

    add-int/lit8 v3, v7, -0x1

    move v10, v11

    :goto_2f
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/y;

    aget v12, v0, v10

    invoke-direct {v8, v12}, Lc0/y;-><init>(F)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_2f

    :cond_43
    const/16 v8, 0x56

    if-ne v3, v8, :cond_44

    add-int/lit8 v3, v7, -0x1

    move v10, v11

    :goto_30
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/z;

    aget v12, v0, v10

    invoke-direct {v8, v12}, Lc0/z;-><init>(F)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_30

    :cond_44
    const/16 v8, 0x63

    if-ne v3, v8, :cond_45

    add-int/lit8 v3, v7, -0x6

    move v10, v11

    :goto_31
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/r;

    aget v13, v0, v10

    add-int/lit8 v12, v10, 0x1

    aget v14, v0, v12

    add-int/lit8 v12, v10, 0x2

    aget v15, v0, v12

    add-int/lit8 v12, v10, 0x3

    aget v16, v0, v12

    add-int/lit8 v12, v10, 0x4

    aget v17, v0, v12

    add-int/lit8 v12, v10, 0x5

    aget v18, v0, v12

    move-object v12, v8

    invoke-direct/range {v12 .. v18}, Lc0/r;-><init>(FFFFFF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x6

    goto :goto_31

    :cond_45
    const/16 v8, 0x43

    if-ne v3, v8, :cond_46

    add-int/lit8 v3, v7, -0x6

    move v10, v11

    :goto_32
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/j;

    aget v13, v0, v10

    add-int/lit8 v12, v10, 0x1

    aget v14, v0, v12

    add-int/lit8 v12, v10, 0x2

    aget v15, v0, v12

    add-int/lit8 v12, v10, 0x3

    aget v16, v0, v12

    add-int/lit8 v12, v10, 0x4

    aget v17, v0, v12

    add-int/lit8 v12, v10, 0x5

    aget v18, v0, v12

    move-object v12, v8

    invoke-direct/range {v12 .. v18}, Lc0/j;-><init>(FFFFFF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x6

    goto :goto_32

    :cond_46
    const/16 v8, 0x73

    if-ne v3, v8, :cond_47

    add-int/lit8 v3, v7, -0x4

    move v10, v11

    :goto_33
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/w;

    aget v12, v0, v10

    add-int/lit8 v13, v10, 0x1

    aget v13, v0, v13

    add-int/lit8 v14, v10, 0x2

    aget v14, v0, v14

    add-int/lit8 v15, v10, 0x3

    aget v15, v0, v15

    invoke-direct {v8, v12, v13, v14, v15}, Lc0/w;-><init>(FFFF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x4

    goto :goto_33

    :cond_47
    const/16 v8, 0x53

    if-ne v3, v8, :cond_48

    add-int/lit8 v3, v7, -0x4

    move v10, v11

    :goto_34
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/o;

    aget v12, v0, v10

    add-int/lit8 v13, v10, 0x1

    aget v13, v0, v13

    add-int/lit8 v14, v10, 0x2

    aget v14, v0, v14

    add-int/lit8 v15, v10, 0x3

    aget v15, v0, v15

    invoke-direct {v8, v12, v13, v14, v15}, Lc0/o;-><init>(FFFF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x4

    goto :goto_34

    :cond_48
    const/16 v8, 0x71

    if-ne v3, v8, :cond_49

    add-int/lit8 v3, v7, -0x4

    move v10, v11

    :goto_35
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/v;

    aget v12, v0, v10

    add-int/lit8 v13, v10, 0x1

    aget v13, v0, v13

    add-int/lit8 v14, v10, 0x2

    aget v14, v0, v14

    add-int/lit8 v15, v10, 0x3

    aget v15, v0, v15

    invoke-direct {v8, v12, v13, v14, v15}, Lc0/v;-><init>(FFFF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x4

    goto :goto_35

    :cond_49
    const/16 v8, 0x51

    if-ne v3, v8, :cond_4a

    add-int/lit8 v3, v7, -0x4

    move v10, v11

    :goto_36
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/n;

    aget v12, v0, v10

    add-int/lit8 v13, v10, 0x1

    aget v13, v0, v13

    add-int/lit8 v14, v10, 0x2

    aget v14, v0, v14

    add-int/lit8 v15, v10, 0x3

    aget v15, v0, v15

    invoke-direct {v8, v12, v13, v14, v15}, Lc0/n;-><init>(FFFF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x4

    goto :goto_36

    :cond_4a
    const/16 v8, 0x74

    if-ne v3, v8, :cond_4b

    add-int/lit8 v3, v7, -0x2

    move v10, v11

    :goto_37
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/x;

    aget v12, v0, v10

    add-int/lit8 v13, v10, 0x1

    aget v13, v0, v13

    invoke-direct {v8, v12, v13}, Lc0/x;-><init>(FF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x2

    goto :goto_37

    :cond_4b
    const/16 v8, 0x54

    if-ne v3, v8, :cond_4c

    add-int/lit8 v3, v7, -0x2

    move v10, v11

    :goto_38
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/p;

    aget v12, v0, v10

    add-int/lit8 v13, v10, 0x1

    aget v13, v0, v13

    invoke-direct {v8, v12, v13}, Lc0/p;-><init>(FF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x2

    goto :goto_38

    :cond_4c
    const/16 v8, 0x61

    if-ne v3, v8, :cond_4f

    add-int/lit8 v3, v7, -0x7

    move v10, v11

    :goto_39
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/q;

    aget v20, v0, v10

    add-int/lit8 v12, v10, 0x1

    aget v21, v0, v12

    add-int/lit8 v12, v10, 0x2

    aget v22, v0, v12

    add-int/lit8 v12, v10, 0x3

    aget v12, v0, v12

    const/4 v14, 0x0

    invoke-static {v12, v14}, Ljava/lang/Float;->compare(FF)I

    move-result v12

    if-eqz v12, :cond_4d

    move/from16 v23, v13

    goto :goto_3a

    :cond_4d
    move/from16 v23, v11

    :goto_3a
    add-int/lit8 v12, v10, 0x4

    aget v12, v0, v12

    invoke-static {v12, v14}, Ljava/lang/Float;->compare(FF)I

    move-result v12

    if-eqz v12, :cond_4e

    move/from16 v24, v13

    goto :goto_3b

    :cond_4e
    move/from16 v24, v11

    :goto_3b
    add-int/lit8 v12, v10, 0x5

    aget v25, v0, v12

    add-int/lit8 v12, v10, 0x6

    aget v26, v0, v12

    move-object/from16 v19, v8

    invoke-direct/range {v19 .. v26}, Lc0/q;-><init>(FFFZZFF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x7

    goto :goto_39

    :cond_4f
    const/16 v8, 0x41

    if-ne v3, v8, :cond_53

    add-int/lit8 v3, v7, -0x7

    move v10, v11

    :goto_3c
    if-gt v10, v3, :cond_52

    new-instance v8, Lc0/h;

    aget v20, v0, v10

    add-int/lit8 v12, v10, 0x1

    aget v21, v0, v12

    add-int/lit8 v12, v10, 0x2

    aget v22, v0, v12

    add-int/lit8 v12, v10, 0x3

    aget v12, v0, v12

    const/4 v14, 0x0

    invoke-static {v12, v14}, Ljava/lang/Float;->compare(FF)I

    move-result v12

    if-eqz v12, :cond_50

    move/from16 v23, v13

    goto :goto_3d

    :cond_50
    move/from16 v23, v11

    :goto_3d
    add-int/lit8 v12, v10, 0x4

    aget v12, v0, v12

    invoke-static {v12, v14}, Ljava/lang/Float;->compare(FF)I

    move-result v12

    if-eqz v12, :cond_51

    move/from16 v24, v13

    goto :goto_3e

    :cond_51
    move/from16 v24, v11

    :goto_3e
    add-int/lit8 v12, v10, 0x5

    aget v25, v0, v12

    add-int/lit8 v12, v10, 0x6

    aget v26, v0, v12

    move-object/from16 v19, v8

    invoke-direct/range {v19 .. v26}, Lc0/h;-><init>(FFFZZFF)V

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x7

    goto :goto_3c

    :cond_52
    :goto_3f
    move-object v0, v4

    move v3, v9

    :goto_40
    move-object/from16 v37, v6

    move v6, v2

    move-object/from16 v2, v37

    goto/16 :goto_2

    :cond_53
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown command for: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_54
    const/4 v11, 0x0

    move/from16 v37, v6

    move-object v6, v2

    move/from16 v2, v37

    move v5, v8

    goto :goto_40

    :cond_55
    const/4 v11, 0x0

    move/from16 v37, v6

    move-object v6, v2

    move/from16 v2, v37

    move v5, v8

    move-object/from16 v37, v6

    move v6, v2

    move-object/from16 v2, v37

    goto/16 :goto_3

    :cond_56
    move-object v6, v2

    return-object v6
.end method


# virtual methods
.method public B(IILandroid/os/Bundle;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public C(LB2/i;Lo0/u;)LB2/i;
    .locals 35

    move-object/from16 v0, p1

    new-instance v1, Ln/m;

    iget-object v2, v0, LB2/i;->e:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ln/m;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_2

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lh0/m;

    iget-wide v7, v6, Lh0/m;->a:J

    move-object/from16 v9, p0

    iget-object v10, v9, LA/t;->e:Ljava/lang/Object;

    check-cast v10, Ln/m;

    invoke-virtual {v10, v7, v8}, Ln/m;->b(J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lh0/l;

    if-nez v7, :cond_0

    iget-wide v7, v6, Lh0/m;->b:J

    iget-wide v11, v6, Lh0/m;->d:J

    move-wide/from16 v24, v7

    move-wide/from16 v26, v11

    const/16 v28, 0x0

    move-object/from16 v8, p2

    goto :goto_1

    :cond_0
    iget-wide v11, v7, Lh0/l;->b:J

    move-object/from16 v8, p2

    invoke-virtual {v8, v11, v12}, Lo0/u;->D(J)J

    move-result-wide v11

    iget-wide v13, v7, Lh0/l;->a:J

    iget-boolean v7, v7, Lh0/l;->c:Z

    move/from16 v28, v7

    move-wide/from16 v26, v11

    move-wide/from16 v24, v13

    :goto_1
    new-instance v7, Lh0/k;

    iget-object v11, v6, Lh0/m;->i:Ljava/util/ArrayList;

    move-object/from16 v30, v11

    iget-wide v11, v6, Lh0/m;->j:J

    move-wide/from16 v31, v11

    iget-wide v11, v6, Lh0/m;->k:J

    move-wide/from16 v33, v11

    iget-wide v11, v6, Lh0/m;->a:J

    move-wide/from16 v16, v11

    iget-wide v13, v6, Lh0/m;->b:J

    move-wide/from16 v18, v13

    iget-wide v13, v6, Lh0/m;->d:J

    move-wide/from16 v20, v13

    iget-boolean v13, v6, Lh0/m;->e:Z

    move/from16 v22, v13

    iget v13, v6, Lh0/m;->f:F

    move/from16 v23, v13

    iget v13, v6, Lh0/m;->g:I

    move/from16 v29, v13

    move-object v15, v7

    invoke-direct/range {v15 .. v34}, Lh0/k;-><init>(JJJZFJJZILjava/util/ArrayList;JJ)V

    invoke-virtual {v1, v11, v12, v7}, Ln/m;->e(JLjava/lang/Object;)V

    iget-wide v11, v6, Lh0/m;->a:J

    iget-boolean v7, v6, Lh0/m;->e:Z

    if-eqz v7, :cond_1

    new-instance v14, Lh0/l;

    move/from16 v20, v5

    iget-wide v4, v6, Lh0/m;->b:J

    move-object/from16 v21, v2

    move/from16 v22, v3

    iget-wide v2, v6, Lh0/m;->c:J

    move-object v13, v14

    move-object v6, v14

    move-wide v14, v4

    move-wide/from16 v16, v2

    move/from16 v18, v7

    invoke-direct/range {v13 .. v18}, Lh0/l;-><init>(JJZ)V

    invoke-virtual {v10, v11, v12, v6}, Ln/m;->e(JLjava/lang/Object;)V

    goto :goto_2

    :cond_1
    move-object/from16 v21, v2

    move/from16 v22, v3

    move/from16 v20, v5

    invoke-virtual {v10, v11, v12}, Ln/m;->f(J)V

    :goto_2
    add-int/lit8 v5, v20, 0x1

    move-object/from16 v2, v21

    move/from16 v3, v22

    goto/16 :goto_0

    :cond_2
    move-object/from16 v9, p0

    new-instance v2, LB2/i;

    const/4 v3, 0x7

    invoke-direct {v2, v1, v3, v0}, LB2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    return-object v2
.end method

.method public D(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Ln/y;

    invoke-virtual {v0, p1}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    instance-of v3, v1, Ln/B;

    if-eqz v3, :cond_2

    check-cast v1, Ln/B;

    invoke-virtual {v1, p2}, Ln/B;->j(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {v1}, Ln/B;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Ln/y;->g(Ljava/lang/Object;)V

    :cond_1
    return p2

    :cond_2
    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {v0, p1}, Ln/y;->g(Ljava/lang/Object;)V

    const/4 v2, 0x1

    :cond_3
    return v2
.end method

.method public E()V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v1, LF/d;

    iget v2, v1, LF/d;->f:I

    if-ge v0, v2, :cond_1

    iget-object v2, v1, LF/d;->d:[Ljava/lang/Object;

    aget-object v2, v2, v0

    check-cast v2, Lh0/e;

    iget-object v3, v2, Lh0/e;->f:LP/k;

    iget-boolean v3, v3, LP/k;->p:Z

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lh0/e;->J()V

    invoke-virtual {v1, v0}, LF/d;->m(I)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2}, LA/t;->E()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public F(Ljava/lang/Object;)V
    .locals 14

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Ln/y;

    iget-object v1, v0, Ln/y;->a:[J

    array-length v2, v1

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_5

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    aget-wide v5, v1, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_4

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_3

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_2

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    iget-object v11, v0, Ln/y;->b:[Ljava/lang/Object;

    aget-object v11, v11, v10

    iget-object v11, v0, Ln/y;->c:[Ljava/lang/Object;

    aget-object v11, v11, v10

    instance-of v12, v11, Ln/B;

    if-eqz v12, :cond_0

    const-string v12, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>"

    invoke-static {v11, v12}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ln/B;

    invoke-virtual {v11, p1}, Ln/B;->j(Ljava/lang/Object;)Z

    invoke-virtual {v11}, Ln/B;->g()Z

    move-result v11

    goto :goto_2

    :cond_0
    if-ne v11, p1, :cond_1

    const/4 v11, 0x1

    goto :goto_2

    :cond_1
    move v11, v3

    :goto_2
    if-eqz v11, :cond_2

    invoke-virtual {v0, v10}, Ln/y;->h(I)Ljava/lang/Object;

    :cond_2
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_3
    if-ne v7, v8, :cond_5

    :cond_4
    if-eq v4, v2, :cond_5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public G(FFJ)V
    .locals 3

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, LB0/a;

    invoke-virtual {v0}, LB0/a;->j()LW/o;

    move-result-object v0

    invoke-static {p3, p4}, LV/c;->b(J)F

    move-result v1

    invoke-static {p3, p4}, LV/c;->c(J)F

    move-result v2

    invoke-interface {v0, v1, v2}, LW/o;->o(FF)V

    invoke-interface {v0, p1, p2}, LW/o;->c(FF)V

    invoke-static {p3, p4}, LV/c;->b(J)F

    move-result p1

    neg-float p1, p1

    invoke-static {p3, p4}, LV/c;->c(J)F

    move-result p2

    neg-float p2, p2

    invoke-interface {v0, p1, p2}, LW/o;->o(FF)V

    return-void
.end method

.method public H()I
    .locals 12

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_4

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-ne v4, v1, :cond_3

    invoke-static {v0}, Ld2/k;->e0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v2, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-interface {v0, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    ushr-int/2addr v5, v3

    move v6, v2

    :goto_1
    if-ge v6, v5, :cond_1

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    add-int/lit8 v8, v6, 0x1

    mul-int/lit8 v8, v8, 0x2

    add-int/lit8 v9, v8, -0x1

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    if-ge v8, v4, :cond_2

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    if-le v11, v10, :cond_2

    if-le v11, v7, :cond_1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v0, v6, v9}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v8, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move v6, v8

    goto :goto_1

    :cond_2
    if-le v10, v7, :cond_1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v0, v6, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v9, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move v6, v9

    goto :goto_1

    :cond_3
    return v1

    :cond_4
    const-string v0, "Set is empty"

    invoke-static {v0}, LD/d;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public I(FF)V
    .locals 1

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, LB0/a;

    invoke-virtual {v0}, LB0/a;->j()LW/o;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LW/o;->o(FF)V

    return-void
.end method

.method public a(Lj/i;Z)V
    .locals 2

    instance-of v0, p1, Lj/t;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lj/t;

    iget-object v0, v0, Lj/t;->v:Lj/i;

    invoke-virtual {v0}, Lj/i;->j()Lj/i;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj/i;->c(Z)V

    :cond_0
    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Lk/h;

    iget-object v0, v0, Lk/h;->h:Lj/o;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lj/o;->a(Lj/i;Z)V

    :cond_1
    return-void
.end method

.method public b(Landroid/view/View;Ld1/l0;)Ld1/l0;
    .locals 6

    const/4 p1, 0x1

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q:Ld1/l0;

    invoke-static {v1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iput-object p2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q:Ld1/l0;

    invoke-virtual {p2}, Ld1/l0;->a()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    move v1, p1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iput-boolean v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_1

    move v1, p1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    iget-object v1, p2, Ld1/l0;->a:Ld1/j0;

    invoke-virtual {v1}, Ld1/j0;->m()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    :goto_2
    if-ge v2, v3, :cond_4

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    sget-object v5, Ld1/K;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v4}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, LQ0/d;

    iget-object v4, v4, LQ0/d;->a:LQ0/a;

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Ld1/j0;->m()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    add-int/2addr v2, p1

    goto :goto_2

    :cond_4
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_5
    return-object p2
.end method

.method public c(Lj/i;)Z
    .locals 3

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Lk/h;

    iget-object v1, v0, Lk/h;->f:Lj/i;

    const/4 v2, 0x0

    if-ne p1, v1, :cond_0

    return v2

    :cond_0
    move-object v1, p1

    check-cast v1, Lj/t;

    iget-object v1, v1, Lj/t;->w:Lj/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lk/h;->h:Lj/o;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lj/o;->c(Lj/i;)Z

    move-result v2

    :cond_1
    return v2
.end method

.method public d(Lj/i;Lj/j;)V
    .locals 7

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Lj/f;

    iget-object v1, v0, Lj/f;->i:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v1, v0, Lj/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    const/4 v5, -0x1

    if-ge v4, v3, :cond_1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lj/e;

    iget-object v6, v6, Lj/e;->b:Lj/i;

    if-ne p1, v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_1
    if-ne v4, v5, :cond_2

    return-void

    :cond_2
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_3

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lj/e;

    :cond_3
    new-instance v1, Lj/d;

    invoke-direct {v1, p0, v2, p2, p1}, Lj/d;-><init>(LA/t;Lj/e;Lj/j;Lj/i;)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0xc8

    add-long/2addr v2, v4

    iget-object p2, v0, Lj/f;->i:Landroid/os/Handler;

    invoke-virtual {p2, v1, p1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method public e()Landroid/content/ClipData;
    .locals 1

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, LM1/a;->d(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    move-result-object v0

    return-object v0
.end method

.method public f(Landroid/view/View;)Z
    .locals 4

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    invoke-virtual {v0, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->r(Landroid/view/View;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    sget-object v1, Ld1/K;->a:Ljava/lang/reflect/Field;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    move v2, v3

    :cond_0
    iget v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->d:I

    if-nez v0, :cond_1

    if-nez v2, :cond_2

    :cond_1
    if-ne v0, v3, :cond_3

    if-nez v2, :cond_3

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    neg-int v0, v0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return v3

    :cond_4
    return v2
.end method

.method public g()Ld1/f;
    .locals 3

    new-instance v0, Ld1/f;

    new-instance v1, LA/t;

    iget-object v2, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v2, Landroid/view/ContentInfo$Builder;

    invoke-static {v2}, LM1/a;->f(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    move-result-object v2

    invoke-direct {v1, v2}, LA/t;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, Ld1/f;-><init>(Ld1/e;)V

    return-object v0
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, LM1/a;->b(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public i()Landroid/view/ContentInfo;
    .locals 1

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    return-object v0
.end method

.method public j(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LM1/a;->v(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)V

    return-void
.end method

.method public k(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LM1/a;->u(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    return-void
.end method

.method public l()I
    .locals 1

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, LM1/a;->z(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public n(Lj/i;Lj/j;)V
    .locals 0

    iget-object p2, p0, LA/t;->e:Ljava/lang/Object;

    check-cast p2, Lj/f;

    iget-object p2, p2, Lj/f;->i:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public o(LB2/f;Lg2/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, LB2/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LB2/a;

    iget v1, v0, LB2/a;->j:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LB2/a;->j:I

    goto :goto_0

    :cond_0
    new-instance v0, LB2/a;

    invoke-direct {v0, p0, p2}, LB2/a;-><init>(LA/t;Lg2/d;)V

    :goto_0
    iget-object p2, v0, LB2/a;->h:Ljava/lang/Object;

    sget-object v1, Lh2/a;->d:Lh2/a;

    iget v2, v0, LB2/a;->j:I

    sget-object v3, Lc2/m;->a:Lc2/m;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, LB2/a;->g:LC2/u;

    :try_start_0
    invoke-static {p2}, LZ0/d;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LZ0/d;->U(Ljava/lang/Object;)V

    new-instance p2, LC2/u;

    iget-object v2, v0, Li2/c;->e:Lg2/i;

    invoke-static {v2}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-direct {p2, p1, v2}, LC2/u;-><init>(LB2/f;Lg2/i;)V

    :try_start_1
    iput-object p2, v0, LB2/a;->g:LC2/u;

    iput v4, v0, LB2/a;->j:I

    iget-object p1, p0, LA/t;->e:Ljava/lang/Object;

    check-cast p1, Li2/j;

    invoke-interface {p1, p2, v0}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v3

    :goto_1
    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p2

    :goto_2
    invoke-virtual {p1}, Li2/c;->m()V

    return-object v3

    :goto_3
    move-object v5, p2

    move-object p2, p1

    move-object p1, v5

    goto :goto_4

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_4
    invoke-virtual {p1}, Li2/c;->m()V

    throw p2
.end method

.method public p(I)V
    .locals 1

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LM1/a;->t(Landroid/view/ContentInfo$Builder;I)V

    return-void
.end method

.method public q(I)V
    .locals 4

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-eq v1, p1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    if-lez v1, :cond_2

    add-int/lit8 v2, v1, 0x1

    ushr-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-le p1, v3, :cond_2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move v1, v2

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public r(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Ln/y;

    invoke-virtual {v0, p1}, Ln/y;->d(Ljava/lang/Object;)I

    move-result v1

    if-gez v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    iget-object v3, v0, Ln/y;->c:[Ljava/lang/Object;

    aget-object v3, v3, v1

    :goto_1
    if-nez v3, :cond_2

    goto :goto_3

    :cond_2
    instance-of v4, v3, Ln/B;

    if-eqz v4, :cond_3

    move-object v4, v3

    check-cast v4, Ln/B;

    invoke-virtual {v4, p2}, Ln/B;->a(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    if-eq v3, p2, :cond_4

    new-instance v4, Ln/B;

    invoke-direct {v4}, Ln/B;-><init>()V

    invoke-virtual {v4, v3}, Ln/B;->a(Ljava/lang/Object;)Z

    invoke-virtual {v4, p2}, Ln/B;->a(Ljava/lang/Object;)Z

    move-object p2, v4

    goto :goto_3

    :cond_4
    :goto_2
    move-object p2, v3

    :goto_3
    if-eqz v2, :cond_5

    not-int v1, v1

    iget-object v2, v0, Ln/y;->b:[Ljava/lang/Object;

    aput-object p1, v2, v1

    iget-object p1, v0, Ln/y;->c:[Ljava/lang/Object;

    aput-object p2, p1, v1

    goto :goto_4

    :cond_5
    iget-object p1, v0, Ln/y;->c:[Ljava/lang/Object;

    aput-object p2, p1, v1

    :goto_4
    return-void
.end method

.method public s(ILe1/j;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public t(Ln/m;Ln0/p;LB2/i;Z)Z
    .locals 6

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, LF/d;

    iget v1, v0, LF/d;->f:I

    const/4 v2, 0x0

    if-lez v1, :cond_3

    iget-object v0, v0, LF/d;->d:[Ljava/lang/Object;

    move v3, v2

    move v4, v3

    :cond_0
    aget-object v5, v0, v3

    check-cast v5, Lh0/e;

    invoke-virtual {v5, p1, p2, p3, p4}, Lh0/e;->t(Ln/m;Ln0/p;LB2/i;Z)Z

    move-result v5

    if-nez v5, :cond_2

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    move v4, v2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v4, 0x1

    :goto_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_0

    move v2, v4

    :cond_3
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, LA/t;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContentInfoCompat{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v1, Landroid/view/ContentInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
    .end packed-switch
.end method

.method public u(LB2/i;)V
    .locals 2

    iget-object p1, p0, LA/t;->e:Ljava/lang/Object;

    check-cast p1, LF/d;

    iget v0, p1, LF/d;->f:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_1

    iget-object v1, p1, LF/d;->d:[Ljava/lang/Object;

    aget-object v1, v1, v0

    check-cast v1, Lh0/e;

    iget-object v1, v1, Lh0/e;->g:LI/m;

    iget v1, v1, LI/m;->e:I

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, LF/d;->m(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public v(I)Le1/j;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public w(I)Le1/j;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public x()LD/L0;
    .locals 3

    invoke-static {}, Lo1/i;->a()Lo1/i;

    move-result-object v0

    invoke-virtual {v0}, Lo1/i;->b()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    new-instance v0, LC0/k;

    invoke-direct {v0, v2}, LC0/k;-><init>(Z)V

    goto :goto_0

    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, LD/d;->A(Ljava/lang/Object;)LD/f0;

    move-result-object v1

    new-instance v2, LC0/g;

    invoke-direct {v2, v1, p0}, LC0/g;-><init>(LD/f0;LA/t;)V

    invoke-virtual {v0, v2}, Lo1/i;->g(Lo1/g;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public y(FFFF)V
    .locals 5

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, LB0/a;

    invoke-virtual {v0}, LB0/a;->j()LW/o;

    move-result-object v1

    invoke-virtual {v0}, LB0/a;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, LV/f;->d(J)F

    move-result v2

    add-float/2addr p3, p1

    sub-float/2addr v2, p3

    invoke-virtual {v0}, LB0/a;->r()J

    move-result-wide v3

    invoke-static {v3, v4}, LV/f;->b(J)F

    move-result p3

    add-float/2addr p4, p2

    sub-float/2addr p3, p4

    invoke-static {v2, p3}, La/a;->d(FF)J

    move-result-wide p3

    invoke-static {p3, p4}, LV/f;->d(J)F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_0

    invoke-static {p3, p4}, LV/f;->b(J)F

    move-result v2

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_0

    invoke-virtual {v0, p3, p4}, LB0/a;->J(J)V

    invoke-interface {v1, p1, p2}, LW/o;->o(FF)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Width and height must be greater than or equal to zero"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public z()J
    .locals 6

    iget v0, p0, LA/t;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, LA/E;

    iget-wide v0, v0, LA/E;->c:J

    return-wide v0

    :pswitch_0
    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, LA/v;

    iget-object v1, v0, LA/v;->v:LA/t;

    iget-object v1, v1, LA/t;->e:Ljava/lang/Object;

    check-cast v1, LA/E;

    iget-wide v1, v1, LA/E;->c:J

    const-wide/16 v3, 0x10

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, LA/D;->b:LD/H;

    invoke-static {v0, v1}, Ln0/C;->h(Ln0/g;LD/k0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LA/B;

    if-eqz v1, :cond_1

    iget-wide v1, v1, LA/B;->a:J

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, LA/s;->a:LD/H;

    invoke-static {v0, v1}, Ln0/C;->h(Ln0/g;LD/k0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW/r;

    iget-wide v1, v0, LW/r;->a:J

    :goto_0
    return-wide v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
