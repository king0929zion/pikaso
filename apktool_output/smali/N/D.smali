.class public final LN/D;
.super LN/c;
.source "SourceFile"


# instance fields
.field public final o:LN/c;

.field public final p:Z

.field public final q:Z

.field public r:Lo2/c;

.field public s:Lo2/c;

.field public final t:J


# direct methods
.method public constructor <init>(LN/c;Lo2/c;Lo2/c;ZZ)V
    .locals 2

    sget-object v0, LN/l;->h:LN/l;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LN/c;->x()Lo2/c;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    sget-object v1, LN/o;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LN/b;

    iget-object v1, v1, LN/c;->e:Lo2/c;

    :cond_1
    invoke-static {p2, v1, p4}, LN/o;->l(Lo2/c;Lo2/c;Z)Lo2/c;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LN/c;->i()Lo2/c;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    sget-object v1, LN/o;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LN/b;

    iget-object v1, v1, LN/c;->f:Lo2/c;

    :cond_3
    invoke-static {p3, v1}, LN/o;->b(Lo2/c;Lo2/c;)Lo2/c;

    move-result-object p3

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, p2, p3}, LN/c;-><init>(ILN/l;Lo2/c;Lo2/c;)V

    iput-object p1, p0, LN/D;->o:LN/c;

    iput-boolean p4, p0, LN/D;->p:Z

    iput-boolean p5, p0, LN/D;->q:Z

    iget-object p1, p0, LN/c;->e:Lo2/c;

    iput-object p1, p0, LN/D;->r:Lo2/c;

    iget-object p1, p0, LN/c;->f:Lo2/c;

    iput-object p1, p0, LN/D;->s:Lo2/c;

    invoke-static {}, LD/d;->u()J

    move-result-wide p1

    iput-wide p1, p0, LN/D;->t:J

    return-void
.end method


# virtual methods
.method public final A(Ln/B;)V
    .locals 0

    invoke-static {}, LN/t;->e()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final B(Lo2/c;Lo2/c;)LN/c;
    .locals 8

    iget-object v0, p0, LN/D;->r:Lo2/c;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, LN/o;->l(Lo2/c;Lo2/c;Z)Lo2/c;

    move-result-object v4

    iget-object p1, p0, LN/D;->s:Lo2/c;

    invoke-static {p2, p1}, LN/o;->b(Lo2/c;Lo2/c;)Lo2/c;

    move-result-object v5

    iget-boolean p1, p0, LN/D;->p:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, LN/D;->C()LN/c;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2, v5}, LN/c;->B(Lo2/c;Lo2/c;)LN/c;

    move-result-object v3

    new-instance p1, LN/D;

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, LN/D;-><init>(LN/c;Lo2/c;Lo2/c;ZZ)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN/D;->C()LN/c;

    move-result-object p1

    invoke-virtual {p1, v4, v5}, LN/c;->B(Lo2/c;Lo2/c;)LN/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final C()LN/c;
    .locals 1

    iget-object v0, p0, LN/D;->o:LN/c;

    if-nez v0, :cond_0

    sget-object v0, LN/o;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/c;

    :cond_0
    return-object v0
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LN/h;->c:Z

    iget-boolean v0, p0, LN/D;->q:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LN/D;->o:LN/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LN/c;->c()V

    :cond_0
    return-void
.end method

.method public final d()I
    .locals 1

    invoke-virtual {p0}, LN/D;->C()LN/c;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->d()I

    move-result v0

    return v0
.end method

.method public final e()LN/l;
    .locals 1

    invoke-virtual {p0}, LN/D;->C()LN/c;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->e()LN/l;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lo2/c;
    .locals 1

    iget-object v0, p0, LN/D;->r:Lo2/c;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    invoke-virtual {p0}, LN/D;->C()LN/c;

    move-result-object v0

    invoke-virtual {v0}, LN/c;->g()Z

    move-result v0

    return v0
.end method

.method public final h()I
    .locals 1

    invoke-virtual {p0}, LN/D;->C()LN/c;

    move-result-object v0

    invoke-virtual {v0}, LN/c;->h()I

    move-result v0

    return v0
.end method

.method public final i()Lo2/c;
    .locals 1

    iget-object v0, p0, LN/D;->s:Lo2/c;

    return-object v0
.end method

.method public final k()V
    .locals 1

    invoke-static {}, LN/t;->e()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final l()V
    .locals 1

    invoke-static {}, LN/t;->e()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final m()V
    .locals 1

    invoke-virtual {p0}, LN/D;->C()LN/c;

    move-result-object v0

    invoke-virtual {v0}, LN/c;->m()V

    return-void
.end method

.method public final n(LN/y;)V
    .locals 1

    invoke-virtual {p0}, LN/D;->C()LN/c;

    move-result-object v0

    invoke-virtual {v0, p1}, LN/c;->n(LN/y;)V

    return-void
.end method

.method public final q(I)V
    .locals 0

    invoke-static {}, LN/t;->e()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final r(LN/l;)V
    .locals 0

    invoke-static {}, LN/t;->e()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final s(I)V
    .locals 1

    invoke-virtual {p0}, LN/D;->C()LN/c;

    move-result-object v0

    invoke-virtual {v0, p1}, LN/c;->s(I)V

    return-void
.end method

.method public final t(Lo2/c;)LN/h;
    .locals 3

    iget-object v0, p0, LN/D;->r:Lo2/c;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, LN/o;->l(Lo2/c;Lo2/c;Z)Lo2/c;

    move-result-object p1

    iget-boolean v0, p0, LN/D;->p:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LN/D;->C()LN/c;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, LN/c;->t(Lo2/c;)LN/h;

    move-result-object v0

    invoke-static {v0, p1, v1}, LN/o;->h(LN/h;Lo2/c;Z)LN/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN/D;->C()LN/c;

    move-result-object v0

    invoke-virtual {v0, p1}, LN/c;->t(Lo2/c;)LN/h;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final v()LN/t;
    .locals 1

    invoke-virtual {p0}, LN/D;->C()LN/c;

    move-result-object v0

    invoke-virtual {v0}, LN/c;->v()LN/t;

    move-result-object v0

    return-object v0
.end method

.method public final w()Ln/B;
    .locals 1

    invoke-virtual {p0}, LN/D;->C()LN/c;

    move-result-object v0

    invoke-virtual {v0}, LN/c;->w()Ln/B;

    move-result-object v0

    return-object v0
.end method

.method public final x()Lo2/c;
    .locals 1

    iget-object v0, p0, LN/D;->r:Lo2/c;

    return-object v0
.end method
