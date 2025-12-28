.class public abstract LA/O;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/H;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, LD/U;->i:LD/U;

    sget-object v1, LA/p;->p:LA/p;

    new-instance v2, LD/H;

    invoke-direct {v2, v0, v1}, LD/H;-><init>(LD/H0;Lo2/a;)V

    sput-object v2, LA/O;->a:LD/H;

    return-void
.end method

.method public static final a(Lv0/B;LD/n;I)V
    .locals 4

    sget-object v0, LG1/c;->a:LL/a;

    const v1, -0x1b6f9f5f

    invoke-virtual {p1, v1}, LD/n;->O(I)LD/n;

    and-int/lit8 v1, p2, 0x6

    if-nez v1, :cond_1

    invoke-virtual {p1, p0}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v2, p2, 0x30

    if-nez v2, :cond_3

    invoke-virtual {p1, v0}, LD/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-virtual {p1}, LD/n;->y()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, LD/n;->K()V

    goto :goto_4

    :cond_5
    :goto_3
    sget-object v2, LA/O;->a:LD/H;

    invoke-virtual {p1, v2}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv0/B;

    invoke-virtual {v3, p0}, Lv0/B;->c(Lv0/B;)Lv0/B;

    move-result-object v3

    invoke-virtual {v2, v3}, LD/H;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v2

    and-int/lit8 v1, v1, 0x70

    const/16 v3, 0x8

    or-int/2addr v1, v3

    invoke-static {v2, v0, p1, v1}, LD/d;->a(LD/l0;LL/a;LD/n;I)V

    :goto_4
    invoke-virtual {p1}, LD/n;->s()LD/n0;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, LA/M;

    invoke-direct {v0, p0, p2}, LA/M;-><init>(Lv0/B;I)V

    iput-object v0, p1, LD/n0;->d:Lo2/e;

    :cond_6
    return-void
.end method

.method public static final b(Ljava/lang/String;LP/l;JJLz0/j;Lz0/l;Lz0/r;JLF0/g;LF0/f;JIZIILo2/c;Lv0/B;LD/n;III)V
    .locals 34

    move-object/from16 v0, p21

    move/from16 v14, p22

    move/from16 v15, p24

    const v1, -0x7a7e7926

    invoke-virtual {v0, v1}, LD/n;->O(I)LD/n;

    and-int/lit8 v1, v14, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move v2, v14

    :goto_1
    and-int/lit8 v3, v15, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v14, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit8 v5, v15, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-wide/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v14, 0x180

    if-nez v6, :cond_5

    move-wide/from16 v6, p2

    invoke-virtual {v0, v6, v7}, LD/n;->e(J)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :goto_5
    and-int/lit8 v8, v15, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v2, v2, 0xc00

    :cond_8
    move-wide/from16 v9, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v14, 0xc00

    if-nez v9, :cond_8

    move-wide/from16 v9, p4

    invoke-virtual {v0, v9, v10}, LD/n;->e(J)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v2, v11

    :goto_7
    or-int/lit16 v11, v2, 0x6000

    and-int/lit8 v12, v15, 0x20

    if-eqz v12, :cond_c

    const v11, 0x36000

    or-int/2addr v11, v2

    :cond_b
    move-object/from16 v2, p7

    goto :goto_9

    :cond_c
    const/high16 v2, 0x30000

    and-int/2addr v2, v14

    if-nez v2, :cond_b

    move-object/from16 v2, p7

    invoke-virtual {v0, v2}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    const/high16 v13, 0x20000

    goto :goto_8

    :cond_d
    const/high16 v13, 0x10000

    :goto_8
    or-int/2addr v11, v13

    :goto_9
    const/high16 v13, 0x6d80000

    or-int/2addr v13, v11

    and-int/lit16 v1, v15, 0x200

    if-eqz v1, :cond_f

    const/high16 v13, 0x36d80000

    or-int/2addr v13, v11

    :cond_e
    move-object/from16 v11, p12

    goto :goto_b

    :cond_f
    const/high16 v11, 0x30000000

    and-int/2addr v11, v14

    if-nez v11, :cond_e

    move-object/from16 v11, p12

    invoke-virtual {v0, v11}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000000

    goto :goto_a

    :cond_10
    const/high16 v16, 0x10000000

    :goto_a
    or-int v13, v13, v16

    :goto_b
    const v16, 0x36db6

    or-int v16, p23, v16

    const/high16 v17, 0x180000

    and-int v17, p23, v17

    if-nez v17, :cond_11

    const v16, 0xb6db6

    or-int v16, p23, v16

    :cond_11
    const v17, 0x12492493

    and-int v2, v13, v17

    const v4, 0x12492492

    if-ne v2, v4, :cond_13

    const v2, 0x92493

    and-int v2, v16, v2

    const v4, 0x92492

    if-ne v2, v4, :cond_13

    invoke-virtual/range {p21 .. p21}, LD/n;->y()Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_c

    :cond_12
    invoke-virtual/range {p21 .. p21}, LD/n;->K()V

    move-object/from16 v2, p1

    move-object/from16 v8, p7

    move-object/from16 v12, p11

    move-wide/from16 v14, p13

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-wide v3, v6

    move-wide v5, v9

    move-object v13, v11

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-wide/from16 v10, p9

    goto/16 :goto_17

    :cond_13
    :goto_c
    const/16 v2, -0x7f

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-virtual {v0, v2, v4, v6, v4}, LD/n;->L(ILjava/lang/Object;ILD/j0;)V

    and-int/lit8 v2, v14, 0x1

    const v7, -0x380001

    if-eqz v2, :cond_15

    invoke-virtual/range {p21 .. p21}, LD/n;->x()Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_d

    :cond_14
    invoke-virtual/range {p21 .. p21}, LD/n;->K()V

    and-int v1, v16, v7

    move-object/from16 v2, p1

    move-wide/from16 v17, p2

    move-object/from16 v4, p6

    move-object/from16 v3, p7

    move-wide/from16 v19, p9

    move-object/from16 v5, p11

    move-wide/from16 v21, p13

    move/from16 v7, p15

    move/from16 v12, p17

    move/from16 v16, p18

    move-object/from16 v23, p19

    move-object/from16 v24, p20

    move/from16 v25, v1

    move-wide v8, v9

    move-object/from16 v1, p8

    move/from16 v10, p16

    goto :goto_12

    :cond_15
    :goto_d
    if-eqz v3, :cond_16

    sget-object v2, LP/i;->a:LP/i;

    goto :goto_e

    :cond_16
    move-object/from16 v2, p1

    :goto_e
    if-eqz v5, :cond_17

    sget-wide v17, LW/r;->f:J

    goto :goto_f

    :cond_17
    move-wide/from16 v17, p2

    :goto_f
    if-eqz v8, :cond_18

    sget-wide v8, LG0/h;->c:J

    goto :goto_10

    :cond_18
    move-wide v8, v9

    :goto_10
    if-eqz v12, :cond_19

    move-object v3, v4

    goto :goto_11

    :cond_19
    move-object/from16 v3, p7

    :goto_11
    sget-wide v19, LG0/h;->c:J

    if-eqz v1, :cond_1a

    move-object v11, v4

    :cond_1a
    sget-object v1, LA/O;->a:LD/H;

    invoke-virtual {v0, v1}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv0/B;

    and-int v5, v16, v7

    const/4 v7, 0x1

    const v10, 0x7fffffff

    move-object/from16 v24, v1

    move-object v1, v4

    move-object/from16 v23, v1

    move/from16 v25, v5

    move/from16 v16, v7

    move v12, v10

    move-wide/from16 v21, v19

    move-object/from16 v5, v23

    move/from16 v10, v16

    :goto_12
    invoke-virtual/range {p21 .. p21}, LD/n;->r()V

    const v6, -0x6cf36ecd

    invoke-virtual {v0, v6}, LD/n;->N(I)V

    const-wide/16 v26, 0x10

    cmp-long v6, v17, v26

    if-eqz v6, :cond_1b

    move-wide/from16 v28, v17

    const/4 v6, 0x0

    goto :goto_15

    :cond_1b
    const v6, -0x6cf36bc8

    invoke-virtual {v0, v6}, LD/n;->N(I)V

    invoke-virtual/range {v24 .. v24}, Lv0/B;->b()J

    move-result-wide v28

    cmp-long v6, v28, v26

    if-eqz v6, :cond_1c

    :goto_13
    const/4 v6, 0x0

    goto :goto_14

    :cond_1c
    sget-object v6, LA/s;->a:LD/H;

    invoke-virtual {v0, v6}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LW/r;

    iget-wide v14, v6, LW/r;->a:J

    move-wide/from16 v28, v14

    goto :goto_13

    :goto_14
    invoke-virtual {v0, v6}, LD/n;->q(Z)V

    :goto_15
    invoke-virtual {v0, v6}, LD/n;->q(Z)V

    if-eqz v11, :cond_1d

    iget v6, v11, LF0/f;->a:I

    goto :goto_16

    :cond_1d
    const/high16 v6, -0x80000000

    :goto_16
    const v14, 0xfd6f50

    move-object/from16 p1, v24

    move-wide/from16 p2, v28

    move-wide/from16 p4, v8

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v1

    move-wide/from16 p9, v19

    move-object/from16 p11, v5

    move/from16 p12, v6

    move-wide/from16 p13, v21

    move/from16 p15, v14

    invoke-static/range {p1 .. p15}, Lv0/B;->d(Lv0/B;JJLz0/l;Lz0/j;Lz0/r;JLF0/g;IJI)Lv0/B;

    move-result-object v6

    and-int/lit8 v13, v13, 0x7e

    shr-int/lit8 v14, v25, 0x6

    and-int/lit16 v14, v14, 0x1c00

    or-int/2addr v13, v14

    shl-int/lit8 v14, v25, 0x9

    const v15, 0xe000

    and-int/2addr v15, v14

    or-int/2addr v13, v15

    const/high16 v15, 0x70000

    and-int/2addr v15, v14

    or-int/2addr v13, v15

    const/high16 v15, 0x380000

    and-int/2addr v15, v14

    or-int/2addr v13, v15

    const/high16 v15, 0x1c00000

    and-int/2addr v14, v15

    or-int/2addr v13, v14

    const/4 v14, 0x0

    move-object/from16 p1, p0

    move-object/from16 p2, v2

    move-object/from16 p3, v6

    move-object/from16 p4, v23

    move/from16 p5, v7

    move/from16 p6, v10

    move/from16 p7, v12

    move/from16 p8, v16

    move-object/from16 p9, v14

    move-object/from16 p10, p21

    move/from16 p11, v13

    invoke-static/range {p1 .. p11}, LZ0/d;->a(Ljava/lang/String;LP/l;Lv0/B;Lo2/c;IZIILA/t;LD/n;I)V

    move-object v13, v11

    move-wide/from16 v14, v21

    move-object/from16 v21, v24

    move-wide/from16 v31, v8

    move-object v9, v1

    move-object v8, v3

    move/from16 v33, v7

    move-object v7, v4

    move-wide/from16 v3, v17

    move/from16 v17, v10

    move/from16 v18, v12

    move-wide/from16 v10, v19

    move-object/from16 v20, v23

    move-object v12, v5

    move-wide/from16 v5, v31

    move/from16 v19, v16

    move/from16 v16, v33

    :goto_17
    invoke-virtual/range {p21 .. p21}, LD/n;->s()LD/n0;

    move-result-object v1

    if-eqz v1, :cond_1e

    new-instance v0, LA/N;

    move-object/from16 p1, v0

    move-object/from16 v30, v1

    move-object/from16 v1, p0

    move/from16 v22, p22

    move/from16 v23, p23

    move/from16 v24, p24

    invoke-direct/range {v0 .. v24}, LA/N;-><init>(Ljava/lang/String;LP/l;JJLz0/j;Lz0/l;Lz0/r;JLF0/g;LF0/f;JIZIILo2/c;Lv0/B;III)V

    move-object/from16 v1, p1

    move-object/from16 v0, v30

    iput-object v1, v0, LD/n0;->d:Lo2/e;

    :cond_1e
    return-void
.end method
