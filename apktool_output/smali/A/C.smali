.class public abstract LA/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lz/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lz/h;

    const v1, 0x3da3d70a    # 0.08f

    const v2, 0x3dcccccd    # 0.1f

    const v3, 0x3e23d70a    # 0.16f

    invoke-direct {v0, v3, v2, v1, v2}, Lz/h;-><init>(FFFF)V

    sput-object v0, LA/C;->a:Lz/h;

    return-void
.end method

.method public static final a(LA0/c;LP/l;ZLW/H;LA/b;LA/g;Lt/p;Ls/g;LD/n;I)V
    .locals 25

    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move-object/from16 v0, p8

    move/from16 v9, p9

    const/4 v1, 0x1

    sget-object v3, LG1/c;->c:LL/a;

    const v4, 0x26c01063

    invoke-virtual {v0, v4}, LD/n;->O(I)LD/n;

    and-int/lit8 v4, v9, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, LD/n;->h(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v9

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v6, v9

    :goto_1
    and-int/lit8 v8, v9, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v0, v2}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v6, v8

    :cond_3
    or-int/lit16 v8, v6, 0x180

    and-int/lit16 v10, v9, 0xc00

    if-nez v10, :cond_4

    or-int/lit16 v8, v6, 0x580

    :cond_4
    and-int/lit16 v6, v9, 0x6000

    if-nez v6, :cond_5

    or-int/lit16 v8, v8, 0x2000

    :cond_5
    const/high16 v6, 0x30000

    and-int/2addr v6, v9

    if-nez v6, :cond_6

    const/high16 v6, 0x10000

    or-int/2addr v8, v6

    :cond_6
    const/high16 v6, 0x180000

    or-int/2addr v6, v8

    const/high16 v8, 0xc00000

    and-int/2addr v8, v9

    if-nez v8, :cond_8

    invoke-virtual {v0, v7}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/high16 v8, 0x800000

    goto :goto_3

    :cond_7
    const/high16 v8, 0x400000

    :goto_3
    or-int/2addr v6, v8

    :cond_8
    const/high16 v8, 0x6000000

    or-int/2addr v6, v8

    const/high16 v8, 0x30000000

    and-int/2addr v8, v9

    if-nez v8, :cond_a

    invoke-virtual {v0, v3}, LD/n;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    const/high16 v3, 0x20000000

    goto :goto_4

    :cond_9
    const/high16 v3, 0x10000000

    :goto_4
    or-int/2addr v6, v3

    :cond_a
    const v3, 0x12492493

    and-int/2addr v3, v6

    const v8, 0x12492492

    if-ne v3, v8, :cond_c

    invoke-virtual/range {p8 .. p8}, LD/n;->y()Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual/range {p8 .. p8}, LD/n;->K()V

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    goto/16 :goto_17

    :cond_c
    :goto_5
    const/16 v3, -0x7f

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-virtual {v0, v3, v8, v10, v8}, LD/n;->L(ILjava/lang/Object;ILD/j0;)V

    and-int/lit8 v3, v9, 0x1

    const v11, -0x7fc01

    if-eqz v3, :cond_e

    invoke-virtual/range {p8 .. p8}, LD/n;->x()Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_6

    :cond_d
    invoke-virtual/range {p8 .. p8}, LD/n;->K()V

    and-int v3, v6, v11

    move-object/from16 v6, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v21, p7

    move v11, v3

    move/from16 v3, p2

    goto :goto_7

    :cond_e
    :goto_6
    sget v3, LA/c;->a:F

    sget v3, LC/c;->b:I

    invoke-static {v3, v0}, LA/H;->a(ILD/n;)LW/H;

    move-result-object v3

    sget-object v12, LA/q;->a:LD/M0;

    invoke-virtual {v0, v12}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LA/o;

    iget-object v13, v12, LA/o;->K:LA/b;

    if-nez v13, :cond_f

    new-instance v13, LA/b;

    const/16 v14, 0x1a

    invoke-static {v12, v14}, LA/q;->b(LA/o;I)J

    move-result-wide v15

    sget v14, LC/c;->h:I

    invoke-static {v12, v14}, LA/q;->b(LA/o;I)J

    move-result-wide v17

    sget v14, LC/c;->c:I

    invoke-static {v12, v14}, LA/q;->b(LA/o;I)J

    move-result-wide v8

    const v14, 0x3df5c28f    # 0.12f

    invoke-static {v8, v9, v14}, LW/r;->b(JF)J

    move-result-wide v19

    sget v8, LC/c;->e:I

    invoke-static {v12, v8}, LA/q;->b(LA/o;I)J

    move-result-wide v8

    const v14, 0x3ec28f5c    # 0.38f

    invoke-static {v8, v9, v14}, LW/r;->b(JF)J

    move-result-wide v21

    move-object v14, v13

    invoke-direct/range {v14 .. v22}, LA/b;-><init>(JJJJ)V

    iput-object v13, v12, LA/o;->K:LA/b;

    :cond_f
    sget v15, LC/c;->a:F

    sget v16, LC/c;->i:F

    sget v17, LC/c;->f:F

    sget v18, LC/c;->g:F

    sget v19, LC/c;->d:F

    new-instance v8, LA/g;

    move-object v14, v8

    invoke-direct/range {v14 .. v19}, LA/g;-><init>(FFFFF)V

    and-int/2addr v6, v11

    move v11, v6

    move-object v9, v8

    move-object v8, v13

    const/16 v21, 0x0

    move-object v6, v3

    move v3, v1

    :goto_7
    invoke-virtual/range {p8 .. p8}, LD/n;->r()V

    const v12, -0xe413d8f

    invoke-virtual {v0, v12}, LD/n;->N(I)V

    sget-object v12, LD/l;->a:LD/U;

    if-nez v21, :cond_11

    invoke-virtual/range {p8 .. p8}, LD/n;->H()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v12, :cond_10

    new-instance v13, Ls/g;

    invoke-direct {v13}, Ls/g;-><init>()V

    invoke-virtual {v0, v13}, LD/n;->V(Ljava/lang/Object;)V

    :cond_10
    check-cast v13, Ls/g;

    goto :goto_8

    :cond_11
    move-object/from16 v13, v21

    :goto_8
    invoke-virtual {v0, v10}, LD/n;->q(Z)V

    if-eqz v3, :cond_12

    iget-wide v14, v8, LA/b;->a:J

    :goto_9
    move-wide/from16 v23, v14

    goto :goto_a

    :cond_12
    iget-wide v14, v8, LA/b;->c:J

    goto :goto_9

    :goto_a
    if-eqz v3, :cond_13

    iget-wide v14, v8, LA/b;->b:J

    goto :goto_b

    :cond_13
    iget-wide v14, v8, LA/b;->d:J

    :goto_b
    const v10, -0xe4123e0

    invoke-virtual {v0, v10}, LD/n;->N(I)V

    if-nez v9, :cond_14

    move-object/from16 p2, v8

    move-object/from16 p3, v13

    move-wide v12, v14

    const/4 v1, 0x0

    const/4 v8, 0x0

    goto/16 :goto_14

    :cond_14
    shr-int/lit8 v10, v11, 0x6

    invoke-virtual/range {p8 .. p8}, LD/n;->H()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v12, :cond_16

    new-instance v11, LN/s;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    sget-object v5, LH/j;->e:LH/j;

    new-instance v1, LN/q;

    invoke-direct {v1, v5}, LN/q;-><init>(LH/c;)V

    sget-object v18, LN/o;->a:LB0/a;

    invoke-virtual/range {v18 .. v18}, LB0/a;->i()Ljava/lang/Object;

    move-result-object v18

    if-eqz v18, :cond_15

    new-instance v4, LN/q;

    invoke-direct {v4, v5}, LN/q;-><init>(LH/c;)V

    const/4 v5, 0x1

    iput v5, v4, LN/A;->a:I

    iput-object v4, v1, LN/A;->b:LN/A;

    goto :goto_c

    :cond_15
    const/4 v5, 0x1

    :goto_c
    iput-object v1, v11, LN/s;->d:LN/q;

    invoke-virtual {v0, v11}, LD/n;->V(Ljava/lang/Object;)V

    goto :goto_d

    :cond_16
    move v5, v1

    :goto_d
    check-cast v11, LN/s;

    invoke-virtual {v0, v13}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual/range {p8 .. p8}, LD/n;->H()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_17

    if-ne v4, v12, :cond_18

    :cond_17
    new-instance v4, LA/e;

    const/4 v1, 0x0

    invoke-direct {v4, v13, v11, v1}, LA/e;-><init>(Ls/g;LN/s;Lg2/d;)V

    invoke-virtual {v0, v4}, LD/n;->V(Ljava/lang/Object;)V

    :cond_18
    check-cast v4, Lo2/e;

    invoke-static {v0, v13, v4}, LD/d;->d(LD/n;Ljava/lang/Object;Lo2/e;)V

    invoke-static {v11}, Ld2/k;->f0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls/f;

    if-nez v3, :cond_19

    iget v4, v9, LA/g;->e:F

    goto :goto_e

    :cond_19
    instance-of v4, v1, Ls/i;

    if-eqz v4, :cond_1a

    iget v4, v9, LA/g;->b:F

    goto :goto_e

    :cond_1a
    instance-of v4, v1, Ls/d;

    if-eqz v4, :cond_1b

    iget v4, v9, LA/g;->d:F

    goto :goto_e

    :cond_1b
    instance-of v4, v1, Ls/b;

    if-eqz v4, :cond_1c

    iget v4, v9, LA/g;->c:F

    goto :goto_e

    :cond_1c
    iget v4, v9, LA/g;->a:F

    :goto_e
    invoke-virtual/range {p8 .. p8}, LD/n;->H()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v12, :cond_1d

    new-instance v11, Lp/d;

    new-instance v5, LG0/e;

    invoke-direct {v5, v4}, LG0/e;-><init>(F)V

    move-object/from16 p2, v8

    sget-object v8, Lp/I;->b:LB2/i;

    move-object/from16 p3, v13

    const/16 v13, 0xc

    move-wide/from16 p4, v14

    const/4 v14, 0x0

    invoke-direct {v11, v5, v8, v14, v13}, Lp/d;-><init>(Ljava/lang/Comparable;LB2/i;Ljava/lang/Float;I)V

    invoke-virtual {v0, v11}, LD/n;->V(Ljava/lang/Object;)V

    goto :goto_f

    :cond_1d
    move-object/from16 p2, v8

    move-object/from16 p3, v13

    move-wide/from16 p4, v14

    :goto_f
    check-cast v11, Lp/d;

    new-instance v5, LG0/e;

    invoke-direct {v5, v4}, LG0/e;-><init>(F)V

    invoke-virtual {v0, v11}, LD/n;->h(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v0, v4}, LD/n;->c(F)Z

    move-result v13

    or-int/2addr v8, v13

    and-int/lit8 v10, v10, 0xe

    xor-int/lit8 v10, v10, 0x6

    const/4 v13, 0x4

    if-le v10, v13, :cond_1f

    invoke-virtual {v0, v3}, LD/n;->g(Z)Z

    move-result v10

    if-nez v10, :cond_1e

    goto :goto_10

    :cond_1e
    const/16 v17, 0x1

    goto :goto_11

    :cond_1f
    :goto_10
    const/16 v17, 0x0

    :goto_11
    or-int v8, v8, v17

    invoke-virtual {v0, v9}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v8, v10

    invoke-virtual {v0, v1}, LD/n;->h(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v8, v10

    invoke-virtual/range {p8 .. p8}, LD/n;->H()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_21

    if-ne v10, v12, :cond_20

    goto :goto_12

    :cond_20
    move-wide/from16 v12, p4

    goto :goto_13

    :cond_21
    :goto_12
    new-instance v10, LA/f;

    const/16 v20, 0x0

    move-wide/from16 v12, p4

    move-object v14, v10

    move-object v15, v11

    move/from16 v16, v4

    move/from16 v17, v3

    move-object/from16 v18, v9

    move-object/from16 v19, v1

    invoke-direct/range {v14 .. v20}, LA/f;-><init>(Lp/d;FZLA/g;Ls/f;Lg2/d;)V

    invoke-virtual {v0, v10}, LD/n;->V(Ljava/lang/Object;)V

    :goto_13
    check-cast v10, Lo2/e;

    invoke-static {v0, v5, v10}, LD/d;->d(LD/n;Ljava/lang/Object;Lo2/e;)V

    iget-object v8, v11, Lp/d;->c:Lp/i;

    const/4 v1, 0x0

    :goto_14
    invoke-virtual {v0, v1}, LD/n;->q(Z)V

    if-eqz v8, :cond_22

    iget-object v4, v8, Lp/i;->e:LD/f0;

    invoke-virtual {v4}, LD/f0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LG0/e;

    iget v4, v4, LG0/e;->d:F

    :goto_15
    move/from16 v19, v4

    goto :goto_16

    :cond_22
    int-to-float v4, v1

    goto :goto_15

    :goto_16
    sget-object v4, LA/h;->f:LA/h;

    sget-object v5, Lt0/h;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v5, Landroidx/compose/ui/semantics/AppendedSemanticsElement;

    invoke-direct {v5, v4, v1}, Landroidx/compose/ui/semantics/AppendedSemanticsElement;-><init>(Lo2/c;Z)V

    invoke-interface {v2, v5}, LP/l;->c(LP/l;)LP/l;

    move-result-object v11

    new-instance v4, LA/j;

    invoke-direct {v4, v12, v13, v7}, LA/j;-><init>(JLt/p;)V

    const v5, 0x3902db2e

    invoke-static {v5, v4, v0}, LL/b;->b(ILp2/h;LD/n;)LL/a;

    move-result-object v20

    int-to-float v1, v1

    sget-object v4, LA/L;->a:LD/H;

    invoke-virtual {v0, v4}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LG0/e;

    iget v5, v5, LG0/e;->d:F

    add-float v15, v5, v1

    sget-object v1, LA/s;->a:LD/H;

    new-instance v5, LW/r;

    invoke-direct {v5, v12, v13}, LW/r;-><init>(J)V

    invoke-virtual {v1, v5}, LD/H;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v1

    new-instance v5, LG0/e;

    invoke-direct {v5, v15}, LG0/e;-><init>(F)V

    invoke-virtual {v4, v5}, LD/H;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v4

    filled-new-array {v1, v4}, [LD/l0;

    move-result-object v1

    new-instance v4, LA/K;

    move-object v10, v4

    move-object v12, v6

    move-object/from16 v5, p3

    move-wide/from16 v13, v23

    move-object/from16 v16, v5

    move/from16 v17, v3

    move-object/from16 v18, p0

    invoke-direct/range {v10 .. v20}, LA/K;-><init>(LP/l;LW/H;JFLs/g;ZLA0/c;FLL/a;)V

    const v5, 0x4c46b75c    # 5.2092272E7f

    invoke-static {v5, v4, v0}, LL/b;->b(ILp2/h;LD/n;)LL/a;

    move-result-object v4

    const/16 v5, 0x38

    invoke-static {v1, v4, v0, v5}, LD/d;->b([LD/l0;LL/a;LD/n;I)V

    move-object/from16 v5, p2

    move-object v4, v6

    move-object v6, v9

    move-object/from16 v8, v21

    :goto_17
    invoke-virtual/range {p8 .. p8}, LD/n;->s()LD/n0;

    move-result-object v10

    if-eqz v10, :cond_23

    new-instance v11, LA/k;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, LA/k;-><init>(LA0/c;LP/l;ZLW/H;LA/b;LA/g;Lt/p;Ls/g;I)V

    iput-object v11, v10, LD/n0;->d:Lo2/e;

    :cond_23
    return-void
.end method

.method public static final b(LP/l;LW/H;LA/l;LA/m;LL/a;LD/n;I)V
    .locals 25

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v0, p5

    move/from16 v6, p6

    const/4 v1, 0x1

    const v2, 0x464f98b1

    invoke-virtual {v0, v2}, LD/n;->O(I)LD/n;

    and-int/lit8 v2, v6, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p0

    invoke-virtual {v0, v2}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_1
    move-object/from16 v2, p0

    move v3, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    move-object/from16 v15, p1

    if-nez v7, :cond_3

    invoke-virtual {v0, v15}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :cond_3
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_4

    or-int/lit16 v3, v3, 0x80

    :cond_4
    and-int/lit16 v7, v6, 0xc00

    if-nez v7, :cond_6

    invoke-virtual {v0, v4}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x800

    goto :goto_3

    :cond_5
    const/16 v7, 0x400

    :goto_3
    or-int/2addr v3, v7

    :cond_6
    or-int/lit16 v3, v3, 0x6000

    const/high16 v7, 0x30000

    and-int/2addr v7, v6

    if-nez v7, :cond_8

    invoke-virtual {v0, v5}, LD/n;->h(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/high16 v7, 0x20000

    goto :goto_4

    :cond_7
    const/high16 v7, 0x10000

    :goto_4
    or-int/2addr v3, v7

    :cond_8
    const v7, 0x12493

    and-int/2addr v3, v7

    const v7, 0x12492

    if-ne v3, v7, :cond_a

    invoke-virtual/range {p5 .. p5}, LD/n;->y()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual/range {p5 .. p5}, LD/n;->K()V

    move-object/from16 v3, p2

    goto/16 :goto_8

    :cond_a
    :goto_5
    const/16 v3, -0x7f

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual {v0, v3, v7, v8, v7}, LD/n;->L(ILjava/lang/Object;ILD/j0;)V

    and-int/lit8 v3, v6, 0x1

    if-eqz v3, :cond_c

    invoke-virtual/range {p5 .. p5}, LD/n;->x()Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual/range {p5 .. p5}, LD/n;->K()V

    move-object/from16 v3, p2

    goto :goto_7

    :cond_c
    :goto_6
    sget-object v3, LA/q;->a:LD/M0;

    invoke-virtual {v0, v3}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LA/o;

    iget-object v7, v3, LA/o;->L:LA/l;

    if-nez v7, :cond_d

    new-instance v7, LA/l;

    sget v9, LC/d;->a:F

    const/16 v9, 0x27

    invoke-static {v3, v9}, LA/q;->b(LA/o;I)J

    move-result-wide v17

    invoke-static {v3, v9}, LA/q;->b(LA/o;I)J

    move-result-wide v10

    invoke-static {v3, v10, v11}, LA/q;->a(LA/o;J)J

    move-result-wide v19

    sget v10, LC/d;->b:I

    invoke-static {v3, v10}, LA/q;->b(LA/o;I)J

    move-result-wide v10

    sget v12, LC/d;->d:F

    invoke-static {v10, v11, v12}, LW/r;->b(JF)J

    move-result-wide v10

    invoke-static {v3, v9}, LA/q;->b(LA/o;I)J

    move-result-wide v12

    invoke-static {v10, v11, v12, v13}, LW/D;->i(JJ)J

    move-result-wide v21

    invoke-static {v3, v9}, LA/q;->b(LA/o;I)J

    move-result-wide v9

    invoke-static {v3, v9, v10}, LA/q;->a(LA/o;J)J

    move-result-wide v9

    const v11, 0x3ec28f5c    # 0.38f

    invoke-static {v9, v10, v11}, LW/r;->b(JF)J

    move-result-wide v23

    move-object/from16 v16, v7

    invoke-direct/range {v16 .. v24}, LA/l;-><init>(JJJJ)V

    iput-object v7, v3, LA/o;->L:LA/l;

    :cond_d
    move-object v3, v7

    :goto_7
    invoke-virtual/range {p5 .. p5}, LD/n;->r()V

    iget-wide v10, v3, LA/l;->a:J

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v7, -0x691c96f5

    invoke-virtual {v0, v7}, LD/n;->N(I)V

    const v7, -0x2bccbebc

    invoke-virtual {v0, v7}, LD/n;->N(I)V

    sget-object v7, LD/l;->a:LD/U;

    invoke-virtual/range {p5 .. p5}, LD/n;->H()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_e

    new-instance v7, LG0/e;

    iget v9, v4, LA/m;->a:F

    invoke-direct {v7, v9}, LG0/e;-><init>(F)V

    invoke-static {v7}, LD/d;->A(Ljava/lang/Object;)LD/f0;

    move-result-object v9

    invoke-virtual {v0, v9}, LD/n;->V(Ljava/lang/Object;)V

    :cond_e
    check-cast v9, LD/Z;

    invoke-virtual {v0, v8}, LD/n;->q(Z)V

    invoke-virtual {v0, v8}, LD/n;->q(Z)V

    invoke-interface {v9}, LD/L0;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LG0/e;

    iget v13, v7, LG0/e;->d:F

    new-instance v7, LA/i;

    invoke-direct {v7, v1, v5}, LA/i;-><init>(ILjava/lang/Object;)V

    const v1, 0x27956c36

    invoke-static {v1, v7, v0}, LL/b;->b(ILp2/h;LD/n;)LL/a;

    move-result-object v14

    int-to-float v1, v8

    sget-object v7, LA/L;->a:LD/H;

    invoke-virtual {v0, v7}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LG0/e;

    iget v8, v8, LG0/e;->d:F

    add-float v12, v8, v1

    sget-object v1, LA/s;->a:LD/H;

    new-instance v8, LW/r;

    iget-wide v4, v3, LA/l;->b:J

    invoke-direct {v8, v4, v5}, LW/r;-><init>(J)V

    invoke-virtual {v1, v8}, LD/H;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v1

    new-instance v4, LG0/e;

    invoke-direct {v4, v12}, LG0/e;-><init>(F)V

    invoke-virtual {v7, v4}, LD/H;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v4

    filled-new-array {v1, v4}, [LD/l0;

    move-result-object v1

    new-instance v4, LA/J;

    move-object v7, v4

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    invoke-direct/range {v7 .. v14}, LA/J;-><init>(LP/l;LW/H;JFFLL/a;)V

    const v5, -0x43a11cd

    invoke-static {v5, v4, v0}, LL/b;->b(ILp2/h;LD/n;)LL/a;

    move-result-object v4

    const/16 v5, 0x38

    invoke-static {v1, v4, v0, v5}, LD/d;->b([LD/l0;LL/a;LD/n;I)V

    :goto_8
    invoke-virtual/range {p5 .. p5}, LD/n;->s()LD/n0;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v8, LA/n;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LA/n;-><init>(LP/l;LW/H;LA/l;LA/m;LL/a;I)V

    iput-object v8, v7, LD/n0;->d:Lo2/e;

    :cond_f
    return-void
.end method
