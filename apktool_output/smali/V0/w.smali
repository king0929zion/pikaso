.class public abstract Lv0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:J

.field public static final c:J

.field public static final d:LF0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0xe

    invoke-static {v0}, La/a;->L(I)J

    move-result-wide v0

    sput-wide v0, Lv0/w;->a:J

    const/4 v0, 0x0

    invoke-static {v0}, La/a;->L(I)J

    move-result-wide v0

    sput-wide v0, Lv0/w;->b:J

    sget-wide v0, LW/r;->e:J

    sput-wide v0, Lv0/w;->c:J

    sget-wide v0, LW/r;->b:J

    const-wide/16 v2, 0x10

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    new-instance v2, LF0/c;

    invoke-direct {v2, v0, v1}, LF0/c;-><init>(J)V

    goto :goto_0

    :cond_0
    sget-object v2, LF0/i;->a:LF0/i;

    :goto_0
    sput-object v2, Lv0/w;->d:LF0/j;

    return-void
.end method

.method public static final a(Lv0/v;JLW/D;FJLz0/l;Lz0/j;Lz0/k;Lz0/r;Ljava/lang/String;JLF0/a;LF0/k;LB0/c;JLF0/g;LW/G;LY/c;)Lv0/v;
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p14

    move-object/from16 v11, p15

    move-object/from16 v12, p16

    move-wide/from16 v13, p17

    move-object/from16 v15, p19

    invoke-static/range {p5 .. p6}, La/a;->S(J)Z

    move-result v16

    const-wide/16 v17, 0x10

    if-nez v16, :cond_3

    iget-wide v13, v0, Lv0/v;->b:J

    move-wide/from16 v11, p5

    invoke-static {v11, v12, v13, v14}, LG0/h;->a(JJ)Z

    move-result v13

    if-eqz v13, :cond_0

    goto :goto_0

    :cond_0
    move-object/from16 v13, p15

    :cond_1
    move-wide/from16 v11, p17

    :cond_2
    move-object/from16 v15, p21

    goto/16 :goto_2

    :cond_3
    move-wide/from16 v11, p5

    :goto_0
    if-nez v3, :cond_4

    cmp-long v13, v1, v17

    if-eqz v13, :cond_4

    iget-object v13, v0, Lv0/v;->a:LF0/j;

    invoke-interface {v13}, LF0/j;->b()J

    move-result-wide v13

    invoke-static {v1, v2, v13, v14}, LW/r;->c(JJ)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_4
    if-eqz v6, :cond_5

    iget-object v13, v0, Lv0/v;->d:Lz0/j;

    invoke-virtual {v6, v13}, Lz0/j;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_5
    if-eqz v5, :cond_6

    iget-object v13, v0, Lv0/v;->c:Lz0/l;

    invoke-virtual {v5, v13}, Lz0/l;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_6
    if-eqz v8, :cond_7

    iget-object v13, v0, Lv0/v;->f:Lz0/r;

    if-ne v8, v13, :cond_0

    :cond_7
    invoke-static/range {p12 .. p13}, La/a;->S(J)Z

    move-result v13

    if-nez v13, :cond_8

    iget-wide v13, v0, Lv0/v;->h:J

    move-wide/from16 v11, p12

    invoke-static {v11, v12, v13, v14}, LG0/h;->a(JJ)Z

    move-result v13

    if-eqz v13, :cond_0

    goto :goto_1

    :cond_8
    move-wide/from16 v11, p12

    :goto_1
    if-eqz v15, :cond_9

    iget-object v13, v0, Lv0/v;->m:LF0/g;

    invoke-virtual {v15, v13}, LF0/g;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_9
    iget-object v13, v0, Lv0/v;->a:LF0/j;

    invoke-interface {v13}, LF0/j;->c()LW/D;

    move-result-object v13

    invoke-static {v3, v13}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    if-eqz v3, :cond_a

    iget-object v13, v0, Lv0/v;->a:LF0/j;

    invoke-interface {v13}, LF0/j;->a()F

    move-result v13

    cmpg-float v13, v4, v13

    if-nez v13, :cond_0

    :cond_a
    if-eqz v7, :cond_b

    iget-object v13, v0, Lv0/v;->e:Lz0/k;

    invoke-virtual {v7, v13}, Lz0/k;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_b
    if-eqz v9, :cond_c

    iget-object v13, v0, Lv0/v;->g:Ljava/lang/String;

    invoke-virtual {v9, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_c
    if-eqz v10, :cond_d

    iget-object v13, v0, Lv0/v;->i:LF0/a;

    invoke-virtual {v10, v13}, LF0/a;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_d
    move-object/from16 v13, p15

    if-eqz v13, :cond_e

    iget-object v14, v0, Lv0/v;->j:LF0/k;

    invoke-virtual {v13, v14}, LF0/k;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    :cond_e
    move-object/from16 v14, p16

    if-eqz v14, :cond_f

    iget-object v11, v0, Lv0/v;->k:LB0/c;

    invoke-virtual {v14, v11}, LB0/c;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    :cond_f
    move-wide/from16 v11, p17

    cmp-long v16, v11, v17

    if-eqz v16, :cond_10

    iget-wide v14, v0, Lv0/v;->l:J

    invoke-static {v11, v12, v14, v15}, LW/r;->c(JJ)Z

    move-result v14

    if-eqz v14, :cond_2

    :cond_10
    move-object/from16 v14, p20

    if-eqz v14, :cond_11

    iget-object v15, v0, Lv0/v;->n:LW/G;

    invoke-virtual {v14, v15}, LW/G;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2

    :cond_11
    move-object/from16 v15, p21

    if-eqz v15, :cond_12

    iget-object v14, v0, Lv0/v;->o:LY/c;

    invoke-virtual {v15, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_12

    goto :goto_2

    :cond_12
    return-object v0

    :goto_2
    sget-object v14, LF0/i;->a:LF0/i;

    if-eqz v3, :cond_16

    instance-of v1, v3, LW/J;

    if-eqz v1, :cond_14

    move-object v1, v3

    check-cast v1, LW/J;

    iget-wide v1, v1, LW/J;->e:J

    invoke-static {v1, v2, v4}, Lr2/a;->P(JF)J

    move-result-wide v1

    cmp-long v3, v1, v17

    if-eqz v3, :cond_13

    new-instance v3, LF0/c;

    invoke-direct {v3, v1, v2}, LF0/c;-><init>(J)V

    goto :goto_3

    :cond_13
    move-object v3, v14

    goto :goto_3

    :cond_14
    instance-of v1, v3, LW/n;

    if-eqz v1, :cond_15

    new-instance v1, LF0/b;

    move-object v2, v3

    check-cast v2, LW/n;

    invoke-direct {v1, v2, v4}, LF0/b;-><init>(LW/n;F)V

    move-object v3, v1

    goto :goto_3

    :cond_15
    new-instance v0, LB1/c;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_16
    cmp-long v3, v1, v17

    if-eqz v3, :cond_13

    new-instance v3, LF0/c;

    invoke-direct {v3, v1, v2}, LF0/c;-><init>(J)V

    :goto_3
    iget-object v1, v0, Lv0/v;->a:LF0/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v2, v3, LF0/b;

    if-eqz v2, :cond_18

    instance-of v4, v1, LF0/b;

    if-eqz v4, :cond_18

    new-instance v2, LF0/b;

    move-object v4, v3

    check-cast v4, LF0/b;

    check-cast v3, LF0/b;

    iget v3, v3, LF0/b;->b:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v14

    if-eqz v14, :cond_17

    invoke-interface {v1}, LF0/j;->a()F

    move-result v3

    :cond_17
    iget-object v1, v4, LF0/b;->a:LW/n;

    invoke-direct {v2, v1, v3}, LF0/b;-><init>(LW/n;F)V

    move-object v3, v2

    goto :goto_4

    :cond_18
    if-eqz v2, :cond_19

    instance-of v4, v1, LF0/b;

    if-nez v4, :cond_19

    goto :goto_4

    :cond_19
    if-nez v2, :cond_1b

    instance-of v2, v1, LF0/b;

    if-eqz v2, :cond_1b

    :cond_1a
    move-object v3, v1

    goto :goto_4

    :cond_1b
    invoke-virtual {v3, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    :goto_4
    if-nez v8, :cond_1c

    iget-object v1, v0, Lv0/v;->f:Lz0/r;

    goto :goto_5

    :cond_1c
    move-object v1, v8

    :goto_5
    invoke-static/range {p5 .. p6}, La/a;->S(J)Z

    move-result v2

    move-object/from16 p10, v1

    if-nez v2, :cond_1d

    move-wide/from16 v1, p5

    goto :goto_6

    :cond_1d
    iget-wide v1, v0, Lv0/v;->b:J

    :goto_6
    if-nez v5, :cond_1e

    iget-object v4, v0, Lv0/v;->c:Lz0/l;

    goto :goto_7

    :cond_1e
    move-object v4, v5

    :goto_7
    if-nez v6, :cond_1f

    iget-object v5, v0, Lv0/v;->d:Lz0/j;

    goto :goto_8

    :cond_1f
    move-object v5, v6

    :goto_8
    if-nez v7, :cond_20

    iget-object v6, v0, Lv0/v;->e:Lz0/k;

    goto :goto_9

    :cond_20
    move-object v6, v7

    :goto_9
    if-nez v9, :cond_21

    iget-object v7, v0, Lv0/v;->g:Ljava/lang/String;

    goto :goto_a

    :cond_21
    move-object v7, v9

    :goto_a
    invoke-static/range {p12 .. p13}, La/a;->S(J)Z

    move-result v8

    if-nez v8, :cond_22

    move-wide/from16 v8, p12

    goto :goto_b

    :cond_22
    iget-wide v8, v0, Lv0/v;->h:J

    :goto_b
    if-nez v10, :cond_23

    iget-object v10, v0, Lv0/v;->i:LF0/a;

    :cond_23
    if-nez v13, :cond_24

    iget-object v13, v0, Lv0/v;->j:LF0/k;

    :cond_24
    if-nez p16, :cond_25

    iget-object v14, v0, Lv0/v;->k:LB0/c;

    goto :goto_c

    :cond_25
    move-object/from16 v14, p16

    :goto_c
    cmp-long v16, v11, v17

    if-eqz v16, :cond_26

    goto :goto_d

    :cond_26
    iget-wide v11, v0, Lv0/v;->l:J

    :goto_d
    move-wide/from16 p14, v11

    if-nez p19, :cond_27

    iget-object v11, v0, Lv0/v;->m:LF0/g;

    goto :goto_e

    :cond_27
    move-object/from16 v11, p19

    :goto_e
    if-nez p20, :cond_28

    iget-object v12, v0, Lv0/v;->n:LW/G;

    goto :goto_f

    :cond_28
    move-object/from16 v12, p20

    :goto_f
    if-nez v15, :cond_29

    iget-object v0, v0, Lv0/v;->o:LY/c;

    move-object v15, v0

    :cond_29
    new-instance v0, Lv0/v;

    move-object/from16 p0, v0

    move-object/from16 p1, v3

    move-wide/from16 p2, v1

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, p10

    move-object/from16 p8, v7

    move-wide/from16 p9, v8

    move-object/from16 p11, v10

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p16, v11

    move-object/from16 p17, v12

    move-object/from16 p18, v15

    invoke-direct/range {p0 .. p18}, Lv0/v;-><init>(LF0/j;JLz0/l;Lz0/j;Lz0/k;Lz0/r;Ljava/lang/String;JLF0/a;LF0/k;LB0/c;JLF0/g;LW/G;LY/c;)V

    return-object v0
.end method
