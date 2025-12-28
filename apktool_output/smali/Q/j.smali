.class public final Lq/j;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/k;
.implements Ln0/a0;


# instance fields
.field public q:J

.field public r:LW/D;

.field public s:F

.field public t:LW/H;

.field public u:J

.field public v:LG0/f;

.field public w:LW/B;

.field public x:LW/H;


# virtual methods
.method public final C(Ln0/B;)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    iget-object v1, v0, Lq/j;->t:LW/H;

    sget-object v2, LW/D;->a:LX1/e;

    if-ne v1, v2, :cond_4

    iget-wide v1, v0, Lq/j;->q:J

    sget-wide v3, LW/r;->f:J

    invoke-static {v1, v2, v3, v4}, LW/r;->c(JJ)Z

    move-result v1

    if-nez v1, :cond_0

    iget-wide v2, v0, Lq/j;->q:J

    const-wide/16 v4, 0x0

    const/16 v6, 0x7e

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, LY/d;->r(LY/d;JJI)V

    :cond_0
    iget-object v2, v0, Lq/j;->r:LW/D;

    if-eqz v2, :cond_f

    iget v1, v0, Lq/j;->s:F

    const/4 v3, 0x0

    const/16 v4, 0x76

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    and-int/lit8 v9, v4, 0x4

    if-eqz v9, :cond_1

    iget-object v5, v12, Ln0/B;->d:LY/b;

    invoke-interface {v5}, LY/d;->L()J

    move-result-wide v5

    invoke-static {v5, v6, v7, v8}, LY/d;->S(JJ)J

    move-result-wide v5

    :cond_1
    and-int/lit8 v9, v4, 0x8

    if-eqz v9, :cond_2

    const/high16 v1, 0x3f800000    # 1.0f

    :cond_2
    move v9, v1

    and-int/lit8 v1, v4, 0x10

    if-eqz v1, :cond_3

    sget-object v1, LY/f;->b:LY/f;

    move-object v10, v1

    goto :goto_0

    :cond_3
    move-object v10, v3

    :goto_0
    const/4 v11, 0x3

    const/4 v13, 0x0

    move-object/from16 v1, p1

    move-wide v3, v7

    move v7, v9

    move-object v8, v10

    move-object v9, v13

    move v10, v11

    invoke-virtual/range {v1 .. v10}, Ln0/B;->g(LW/D;JJFLY/c;LW/l;I)V

    goto/16 :goto_5

    :cond_4
    new-instance v1, Lp2/o;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v2, v12, Ln0/B;->d:LY/b;

    invoke-interface {v2}, LY/d;->L()J

    move-result-wide v3

    iget-wide v5, v0, Lq/j;->u:J

    invoke-static {v3, v4, v5, v6}, LV/f;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual/range {p1 .. p1}, Ln0/B;->getLayoutDirection()LG0/f;

    move-result-object v3

    iget-object v4, v0, Lq/j;->v:LG0/f;

    if-ne v3, v4, :cond_5

    iget-object v3, v0, Lq/j;->x:LW/H;

    iget-object v4, v0, Lq/j;->t:LW/H;

    invoke-static {v3, v4}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, v0, Lq/j;->w:LW/B;

    invoke-static {v3}, Lp2/g;->b(Ljava/lang/Object;)V

    iput-object v3, v1, Lp2/o;->d:Ljava/lang/Object;

    goto :goto_1

    :cond_5
    new-instance v3, Ln0/D;

    const/4 v4, 0x3

    invoke-direct {v3, v1, v0, v12, v4}, Ln0/D;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v0, v3}, Ln0/C;->o(LP/k;Lo2/a;)V

    :goto_1
    iget-object v3, v1, Lp2/o;->d:Ljava/lang/Object;

    check-cast v3, LW/B;

    iput-object v3, v0, Lq/j;->w:LW/B;

    invoke-interface {v2}, LY/d;->L()J

    move-result-wide v3

    iput-wide v3, v0, Lq/j;->u:J

    invoke-virtual/range {p1 .. p1}, Ln0/B;->getLayoutDirection()LG0/f;

    move-result-object v3

    iput-object v3, v0, Lq/j;->v:LG0/f;

    iget-object v3, v0, Lq/j;->t:LW/H;

    iput-object v3, v0, Lq/j;->x:LW/H;

    iget-object v1, v1, Lp2/o;->d:Ljava/lang/Object;

    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    move-object v13, v1

    check-cast v13, LW/B;

    iget-wide v3, v0, Lq/j;->q:J

    sget-wide v5, LW/r;->f:J

    invoke-static {v3, v4, v5, v6}, LW/r;->c(JJ)Z

    move-result v1

    sget-object v14, LY/f;->b:LY/f;

    if-nez v1, :cond_a

    iget-wide v3, v0, Lq/j;->q:J

    instance-of v1, v13, LW/z;

    const/4 v10, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v11, 0x3

    if-eqz v1, :cond_6

    move-object v1, v13

    check-cast v1, LW/z;

    iget-object v1, v1, LW/z;->a:LV/d;

    iget v2, v1, LV/d;->b:F

    iget v5, v1, LV/d;->a:F

    invoke-static {v5, v2}, Lr2/a;->f(FF)J

    move-result-wide v5

    invoke-virtual {v1}, LV/d;->c()F

    move-result v2

    invoke-virtual {v1}, LV/d;->b()F

    move-result v1

    invoke-static {v2, v1}, La/a;->d(FF)J

    move-result-wide v15

    move-object/from16 v1, p1

    move-wide v2, v3

    move-wide v4, v5

    move-wide v6, v15

    move-object v9, v14

    invoke-virtual/range {v1 .. v11}, Ln0/B;->x(JJJFLY/c;LW/l;I)V

    goto/16 :goto_3

    :cond_6
    instance-of v1, v13, LW/A;

    if-eqz v1, :cond_8

    move-object v1, v13

    check-cast v1, LW/A;

    iget-object v5, v1, LW/A;->b:LW/i;

    if-eqz v5, :cond_7

    move-object/from16 v1, p1

    move-object v2, v5

    :goto_2
    move v5, v8

    move-object v6, v14

    move-object v7, v10

    move v8, v11

    invoke-virtual/range {v1 .. v8}, Ln0/B;->d(LW/i;JFLY/c;LW/l;I)V

    goto :goto_3

    :cond_7
    iget-object v1, v1, LW/A;->a:LV/e;

    iget-wide v5, v1, LV/e;->h:J

    invoke-static {v5, v6}, LV/a;->b(J)F

    move-result v5

    iget v6, v1, LV/e;->b:F

    iget v7, v1, LV/e;->a:F

    invoke-static {v7, v6}, Lr2/a;->f(FF)J

    move-result-wide v6

    invoke-virtual {v1}, LV/e;->b()F

    move-result v9

    invoke-virtual {v1}, LV/e;->a()F

    move-result v1

    invoke-static {v9, v1}, La/a;->d(FF)J

    move-result-wide v15

    invoke-static {v5, v5}, Lr2/a;->a(FF)J

    move-result-wide v17

    iget-object v1, v2, LY/b;->d:LY/a;

    iget-object v1, v1, LY/a;->c:LW/o;

    invoke-static {v6, v7}, LV/c;->b(J)F

    move-result v20

    invoke-static {v6, v7}, LV/c;->c(J)F

    move-result v21

    invoke-static {v6, v7}, LV/c;->b(J)F

    move-result v5

    invoke-static/range {v15 .. v16}, LV/f;->d(J)F

    move-result v9

    add-float v22, v9, v5

    invoke-static {v6, v7}, LV/c;->c(J)F

    move-result v5

    invoke-static/range {v15 .. v16}, LV/f;->b(J)F

    move-result v6

    add-float v23, v6, v5

    invoke-static/range {v17 .. v18}, LV/a;->b(J)F

    move-result v24

    invoke-static/range {v17 .. v18}, LV/a;->c(J)F

    move-result v25

    move-object v5, v14

    move v6, v8

    move-object v7, v10

    move v8, v11

    invoke-static/range {v2 .. v8}, LY/b;->a(LY/b;JLY/c;FLW/l;I)LW/g;

    move-result-object v26

    move-object/from16 v19, v1

    invoke-interface/range {v19 .. v26}, LW/o;->f(FFFFFFLW/g;)V

    goto :goto_3

    :cond_8
    instance-of v1, v13, LW/y;

    if-eqz v1, :cond_9

    move-object v1, v13

    check-cast v1, LW/y;

    iget-object v2, v1, LW/y;->a:LW/i;

    move-object/from16 v1, p1

    goto :goto_2

    :cond_9
    new-instance v1, LB1/c;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_a
    :goto_3
    iget-object v4, v0, Lq/j;->r:LW/D;

    if-eqz v4, :cond_f

    iget v7, v0, Lq/j;->s:F

    instance-of v1, v13, LW/z;

    const/4 v9, 0x0

    const/4 v10, 0x3

    if-eqz v1, :cond_b

    check-cast v13, LW/z;

    iget-object v1, v13, LW/z;->a:LV/d;

    iget v2, v1, LV/d;->b:F

    iget v3, v1, LV/d;->a:F

    invoke-static {v3, v2}, Lr2/a;->f(FF)J

    move-result-wide v5

    invoke-virtual {v1}, LV/d;->c()F

    move-result v2

    invoke-virtual {v1}, LV/d;->b()F

    move-result v1

    invoke-static {v2, v1}, La/a;->d(FF)J

    move-result-wide v15

    move-object/from16 v1, p1

    move-object v2, v4

    move-wide v3, v5

    move-wide v5, v15

    move-object v8, v14

    invoke-virtual/range {v1 .. v10}, Ln0/B;->g(LW/D;JJFLY/c;LW/l;I)V

    goto/16 :goto_5

    :cond_b
    instance-of v1, v13, LW/A;

    if-eqz v1, :cond_d

    check-cast v13, LW/A;

    iget-object v2, v13, LW/A;->b:LW/i;

    if-eqz v2, :cond_c

    :goto_4
    move-object/from16 v1, p1

    move-object v3, v4

    move v4, v7

    move-object v5, v14

    move-object v6, v9

    move v7, v10

    invoke-virtual/range {v1 .. v7}, Ln0/B;->m(LW/C;LW/D;FLY/c;LW/l;I)V

    goto :goto_5

    :cond_c
    iget-object v1, v13, LW/A;->a:LV/e;

    iget-wide v2, v1, LV/e;->h:J

    invoke-static {v2, v3}, LV/a;->b(J)F

    move-result v2

    iget v3, v1, LV/e;->b:F

    iget v5, v1, LV/e;->a:F

    invoke-static {v5, v3}, Lr2/a;->f(FF)J

    move-result-wide v5

    invoke-virtual {v1}, LV/e;->b()F

    move-result v3

    invoke-virtual {v1}, LV/e;->a()F

    move-result v1

    invoke-static {v3, v1}, La/a;->d(FF)J

    move-result-wide v15

    invoke-static {v2, v2}, Lr2/a;->a(FF)J

    move-result-wide v1

    iget-object v3, v12, Ln0/B;->d:LY/b;

    iget-object v8, v3, LY/b;->d:LY/a;

    iget-object v11, v8, LY/a;->c:LW/o;

    invoke-static {v5, v6}, LV/c;->b(J)F

    move-result v18

    invoke-static {v5, v6}, LV/c;->c(J)F

    move-result v19

    invoke-static {v5, v6}, LV/c;->b(J)F

    move-result v8

    invoke-static/range {v15 .. v16}, LV/f;->d(J)F

    move-result v13

    add-float v20, v13, v8

    invoke-static {v5, v6}, LV/c;->c(J)F

    move-result v5

    invoke-static/range {v15 .. v16}, LV/f;->b(J)F

    move-result v6

    add-float v21, v6, v5

    invoke-static {v1, v2}, LV/a;->b(J)F

    move-result v22

    invoke-static {v1, v2}, LV/a;->c(J)F

    move-result v23

    const/4 v1, 0x1

    move-object v5, v14

    move v6, v7

    move-object v7, v9

    move v8, v10

    move v9, v1

    invoke-virtual/range {v3 .. v9}, LY/b;->c(LW/D;LY/c;FLW/l;II)LW/g;

    move-result-object v24

    move-object/from16 v17, v11

    invoke-interface/range {v17 .. v24}, LW/o;->f(FFFFFFLW/g;)V

    goto :goto_5

    :cond_d
    instance-of v1, v13, LW/y;

    if-eqz v1, :cond_e

    check-cast v13, LW/y;

    iget-object v2, v13, LW/y;->a:LW/i;

    goto :goto_4

    :cond_e
    new-instance v1, LB1/c;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_f
    :goto_5
    invoke-virtual/range {p1 .. p1}, Ln0/B;->a()V

    return-void
.end method

.method public final Q()V
    .locals 2

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v0, p0, Lq/j;->u:J

    const/4 v0, 0x0

    iput-object v0, p0, Lq/j;->v:LG0/f;

    iput-object v0, p0, Lq/j;->w:LW/B;

    iput-object v0, p0, Lq/j;->x:LW/H;

    invoke-static {p0}, Ln0/C;->k(Ln0/k;)V

    return-void
.end method
