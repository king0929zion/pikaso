.class public final LT/c;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/s;
.implements Ln0/k;


# instance fields
.field public q:Lb0/b;

.field public r:Z

.field public s:LP/d;

.field public t:Ll0/d;

.field public u:F

.field public v:LW/l;


# direct methods
.method public static f0(J)Z
    .locals 2

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {p0, p1, v0, v1}, LV/f;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, LV/f;->b(J)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static g0(J)Z
    .locals 2

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {p0, p1, v0, v1}, LV/f;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, LV/f;->d(J)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final C(Ln0/B;)V
    .locals 14

    iget-object v0, p0, LT/c;->q:Lb0/b;

    invoke-virtual {v0}, Lb0/b;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, LT/c;->g0(J)Z

    move-result v2

    iget-object v3, p1, Ln0/B;->d:LY/b;

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, LV/f;->d(J)F

    move-result v2

    goto :goto_0

    :cond_0
    invoke-interface {v3}, LY/d;->L()J

    move-result-wide v4

    invoke-static {v4, v5}, LV/f;->d(J)F

    move-result v2

    :goto_0
    invoke-static {v0, v1}, LT/c;->f0(J)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v0, v1}, LV/f;->b(J)F

    move-result v0

    goto :goto_1

    :cond_1
    invoke-interface {v3}, LY/d;->L()J

    move-result-wide v0

    invoke-static {v0, v1}, LV/f;->b(J)F

    move-result v0

    :goto_1
    invoke-static {v2, v0}, La/a;->d(FF)J

    move-result-wide v0

    invoke-interface {v3}, LY/d;->L()J

    move-result-wide v4

    invoke-static {v4, v5}, LV/f;->d(J)F

    move-result v2

    const/4 v4, 0x0

    cmpg-float v2, v2, v4

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v3}, LY/d;->L()J

    move-result-wide v5

    invoke-static {v5, v6}, LV/f;->b(J)F

    move-result v2

    cmpg-float v2, v2, v4

    if-nez v2, :cond_3

    :goto_2
    const-wide/16 v0, 0x0

    :goto_3
    move-wide v6, v0

    goto :goto_4

    :cond_3
    iget-object v2, p0, LT/c;->t:Ll0/d;

    invoke-interface {v3}, LY/d;->L()J

    move-result-wide v4

    invoke-virtual {v2, v0, v1, v4, v5}, Ll0/d;->a(JJ)J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, LZ0/d;->V(JJ)J

    move-result-wide v0

    goto :goto_3

    :goto_4
    iget-object v8, p0, LT/c;->s:LP/d;

    invoke-static {v6, v7}, LV/f;->d(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v6, v7}, LV/f;->b(J)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v0, v1}, Lr2/a;->d(II)J

    move-result-wide v9

    invoke-interface {v3}, LY/d;->L()J

    move-result-wide v0

    invoke-static {v0, v1}, LV/f;->d(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-interface {v3}, LY/d;->L()J

    move-result-wide v1

    invoke-static {v1, v2}, LV/f;->b(J)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v0, v1}, Lr2/a;->d(II)J

    move-result-wide v11

    invoke-virtual {p1}, Ln0/B;->getLayoutDirection()LG0/f;

    move-result-object v13

    invoke-virtual/range {v8 .. v13}, LP/d;->a(JJLG0/f;)J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long v4, v0, v2

    long-to-int v2, v4

    int-to-float v2, v2

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    long-to-int v0, v0

    int-to-float v0, v0

    iget-object v1, v3, LY/b;->e:LB0/a;

    iget-object v1, v1, LB0/a;->b:Ljava/lang/Object;

    check-cast v1, LA/t;

    invoke-virtual {v1, v2, v0}, LA/t;->I(FF)V

    :try_start_0
    iget-object v4, p0, LT/c;->q:Lb0/b;

    iget v8, p0, LT/c;->u:F

    iget-object v9, p0, LT/c;->v:LW/l;

    move-object v5, p1

    invoke-virtual/range {v4 .. v9}, Lb0/b;->c(Ln0/B;JFLW/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, v3, LY/b;->e:LB0/a;

    iget-object v1, v1, LB0/a;->b:Ljava/lang/Object;

    check-cast v1, LA/t;

    neg-float v2, v2

    neg-float v0, v0

    invoke-virtual {v1, v2, v0}, LA/t;->I(FF)V

    invoke-virtual {p1}, Ln0/B;->a()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, v3, LY/b;->e:LB0/a;

    iget-object v1, v1, LB0/a;->b:Ljava/lang/Object;

    check-cast v1, LA/t;

    neg-float v2, v2

    neg-float v0, v0

    invoke-virtual {v1, v2, v0}, LA/t;->I(FF)V

    throw p1
.end method

.method public final R(Ln0/L;Ll0/j;J)LM1/j;
    .locals 7

    invoke-static {p3, p4}, LG0/a;->d(J)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-static {p3, p4}, LG0/a;->c(J)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {p3, p4}, LG0/a;->f(J)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p3, p4}, LG0/a;->e(J)Z

    move-result v3

    if-eqz v3, :cond_1

    move v1, v2

    :cond_1
    iget-boolean v2, p0, LT/c;->r:Z

    const-wide v3, 0x7fc000007fc00000L    # 2.247117487993712E307

    if-eqz v2, :cond_2

    iget-object v2, p0, LT/c;->q:Lb0/b;

    invoke-virtual {v2}, Lb0/b;->d()J

    move-result-wide v5

    cmp-long v2, v5, v3

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    if-nez v0, :cond_b

    :goto_1
    if-eqz v1, :cond_3

    goto/16 :goto_8

    :cond_3
    iget-object v0, p0, LT/c;->q:Lb0/b;

    invoke-virtual {v0}, Lb0/b;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, LT/c;->g0(J)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {v0, v1}, LV/f;->d(J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    goto :goto_2

    :cond_4
    invoke-static {p3, p4}, LG0/a;->j(J)I

    move-result v2

    :goto_2
    invoke-static {v0, v1}, LT/c;->f0(J)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {v0, v1}, LV/f;->b(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto :goto_3

    :cond_5
    invoke-static {p3, p4}, LG0/a;->i(J)I

    move-result v0

    :goto_3
    invoke-static {p3, p4, v2}, La/a;->p(JI)I

    move-result v1

    invoke-static {p3, p4, v0}, La/a;->o(JI)I

    move-result v0

    int-to-float v1, v1

    int-to-float v0, v0

    invoke-static {v1, v0}, La/a;->d(FF)J

    move-result-wide v0

    iget-boolean v2, p0, LT/c;->r:Z

    if-eqz v2, :cond_a

    iget-object v2, p0, LT/c;->q:Lb0/b;

    invoke-virtual {v2}, Lb0/b;->d()J

    move-result-wide v5

    cmp-long v2, v5, v3

    if-eqz v2, :cond_a

    iget-object v2, p0, LT/c;->q:Lb0/b;

    invoke-virtual {v2}, Lb0/b;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, LT/c;->g0(J)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static {v0, v1}, LV/f;->d(J)F

    move-result v2

    goto :goto_4

    :cond_6
    iget-object v2, p0, LT/c;->q:Lb0/b;

    invoke-virtual {v2}, Lb0/b;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, LV/f;->d(J)F

    move-result v2

    :goto_4
    iget-object v3, p0, LT/c;->q:Lb0/b;

    invoke-virtual {v3}, Lb0/b;->d()J

    move-result-wide v3

    invoke-static {v3, v4}, LT/c;->f0(J)Z

    move-result v3

    if-nez v3, :cond_7

    invoke-static {v0, v1}, LV/f;->b(J)F

    move-result v3

    goto :goto_5

    :cond_7
    iget-object v3, p0, LT/c;->q:Lb0/b;

    invoke-virtual {v3}, Lb0/b;->d()J

    move-result-wide v3

    invoke-static {v3, v4}, LV/f;->b(J)F

    move-result v3

    :goto_5
    invoke-static {v2, v3}, La/a;->d(FF)J

    move-result-wide v2

    invoke-static {v0, v1}, LV/f;->d(J)F

    move-result v4

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-nez v4, :cond_8

    goto :goto_6

    :cond_8
    invoke-static {v0, v1}, LV/f;->b(J)F

    move-result v4

    cmpg-float v4, v4, v5

    if-nez v4, :cond_9

    :goto_6
    const-wide/16 v0, 0x0

    goto :goto_7

    :cond_9
    iget-object v4, p0, LT/c;->t:Ll0/d;

    invoke-virtual {v4, v2, v3, v0, v1}, Ll0/d;->a(JJ)J

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, LZ0/d;->V(JJ)J

    move-result-wide v0

    :cond_a
    :goto_7
    invoke-static {v0, v1}, LV/f;->d(J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-static {p3, p4, v2}, La/a;->p(JI)I

    move-result v2

    invoke-static {v0, v1}, LV/f;->b(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {p3, p4, v0}, La/a;->o(JI)I

    move-result v0

    invoke-static {v2, v0, p3, p4}, LG0/a;->a(IIJ)J

    move-result-wide p3

    goto :goto_9

    :cond_b
    :goto_8
    invoke-static {p3, p4}, LG0/a;->h(J)I

    move-result v0

    invoke-static {p3, p4}, LG0/a;->g(J)I

    move-result v1

    invoke-static {v0, v1, p3, p4}, LG0/a;->a(IIJ)J

    move-result-wide p3

    :goto_9
    invoke-interface {p2, p3, p4}, Ll0/j;->a(J)Ll0/o;

    move-result-object p2

    iget p3, p2, Ll0/o;->d:I

    iget p4, p2, Ll0/o;->e:I

    new-instance v0, LT/b;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, LT/b;-><init>(Ll0/o;I)V

    sget-object p2, Ld2/t;->d:Ld2/t;

    invoke-virtual {p1, p3, p4, p2, v0}, Ln0/L;->b0(IILjava/util/Map;Lo2/c;)LM1/j;

    move-result-object p1

    return-object p1
.end method

.method public final V()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PainterModifier(painter="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LT/c;->q:Lb0/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sizeToIntrinsics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LT/c;->r:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT/c;->s:LP/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LT/c;->u:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", colorFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LT/c;->v:LW/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
