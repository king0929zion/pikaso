.class public final LS/d;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/o0;
.implements Ln0/h;


# instance fields
.field public q:LS/d;


# virtual methods
.method public final Z()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LS/d;->q:LS/d;

    return-void
.end method

.method public final f0(LA/t;)Z
    .locals 1

    iget-object v0, p0, LS/d;->q:LS/d;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LS/d;->f0(LA/t;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public final g0(LA/t;)V
    .locals 1

    iget-object v0, p0, LS/d;->q:LS/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LS/d;->g0(LA/t;)V

    :cond_0
    return-void
.end method

.method public final h0(LA/t;)V
    .locals 1

    iget-object v0, p0, LS/d;->q:LS/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LS/d;->h0(LA/t;)V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, LS/d;->q:LS/d;

    return-void
.end method

.method public final i0(LA/t;)V
    .locals 4

    iget-object v0, p0, LS/d;->q:LS/d;

    if-eqz v0, :cond_0

    iget-object v1, p1, LA/t;->e:Ljava/lang/Object;

    check-cast v1, Landroid/view/DragEvent;

    invoke-virtual {v1}, Landroid/view/DragEvent;->getX()F

    move-result v2

    invoke-virtual {v1}, Landroid/view/DragEvent;->getY()F

    move-result v1

    invoke-static {v2, v1}, Lr2/a;->f(FF)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, La/a;->g(LS/d;J)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    move-object v1, v0

    goto :goto_1

    :cond_0
    iget-object v1, p0, LP/k;->d:LP/k;

    iget-boolean v1, v1, LP/k;->p:Z

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    new-instance v1, Lp2/o;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, LD2/p;

    const/4 v3, 0x1

    invoke-direct {v2, v1, p0, p1, v3}, LD2/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p0, v2}, Ln0/C;->t(Ln0/o0;Lo2/c;)V

    iget-object v1, v1, Lp2/o;->d:Ljava/lang/Object;

    check-cast v1, Ln0/o0;

    :goto_0
    check-cast v1, LS/d;

    :goto_1
    if-eqz v1, :cond_2

    if-nez v0, :cond_2

    invoke-virtual {v1, p1}, LS/d;->g0(LA/t;)V

    invoke-virtual {v1, p1}, LS/d;->i0(LA/t;)V

    goto :goto_2

    :cond_2
    if-nez v1, :cond_3

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, LS/d;->h0(LA/t;)V

    goto :goto_2

    :cond_3
    invoke-static {v1, v0}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    if-eqz v1, :cond_4

    invoke-virtual {v1, p1}, LS/d;->g0(LA/t;)V

    invoke-virtual {v1, p1}, LS/d;->i0(LA/t;)V

    :cond_4
    if-eqz v0, :cond_6

    invoke-virtual {v0, p1}, LS/d;->h0(LA/t;)V

    goto :goto_2

    :cond_5
    if-eqz v1, :cond_6

    invoke-virtual {v1, p1}, LS/d;->i0(LA/t;)V

    :cond_6
    :goto_2
    iput-object v1, p0, LS/d;->q:LS/d;

    return-void
.end method

.method public final j()Ljava/lang/Object;
    .locals 1

    sget-object v0, LS/b;->a:LS/b;

    return-object v0
.end method

.method public final j0(LA/t;)V
    .locals 1

    iget-object v0, p0, LS/d;->q:LS/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LS/d;->j0(LA/t;)V

    :cond_0
    return-void
.end method
