.class public final LN/E;
.super LN/h;
.source "SourceFile"


# instance fields
.field public final e:LN/h;

.field public final f:Z

.field public g:Lo2/c;

.field public final h:J


# direct methods
.method public constructor <init>(LN/h;Lo2/c;Z)V
    .locals 2

    sget-object v0, LN/l;->h:LN/l;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, LN/h;-><init>(ILN/l;)V

    iput-object p1, p0, LN/E;->e:LN/h;

    iput-boolean p3, p0, LN/E;->f:Z

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LN/h;->f()Lo2/c;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, LN/o;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LN/b;

    iget-object p1, p1, LN/c;->e:Lo2/c;

    :cond_1
    invoke-static {p2, p1, v1}, LN/o;->l(Lo2/c;Lo2/c;Z)Lo2/c;

    move-result-object p1

    iput-object p1, p0, LN/E;->g:Lo2/c;

    invoke-static {}, LD/d;->u()J

    move-result-wide p1

    iput-wide p1, p0, LN/E;->h:J

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LN/h;->c:Z

    iget-boolean v0, p0, LN/E;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LN/E;->e:LN/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LN/h;->c()V

    :cond_0
    return-void
.end method

.method public final d()I
    .locals 1

    invoke-virtual {p0}, LN/E;->u()LN/h;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->d()I

    move-result v0

    return v0
.end method

.method public final e()LN/l;
    .locals 1

    invoke-virtual {p0}, LN/E;->u()LN/h;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->e()LN/l;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lo2/c;
    .locals 1

    iget-object v0, p0, LN/E;->g:Lo2/c;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    invoke-virtual {p0}, LN/E;->u()LN/h;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->g()Z

    move-result v0

    return v0
.end method

.method public final i()Lo2/c;
    .locals 1

    const/4 v0, 0x0

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

    invoke-virtual {p0}, LN/E;->u()LN/h;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->m()V

    return-void
.end method

.method public final n(LN/y;)V
    .locals 1

    invoke-virtual {p0}, LN/E;->u()LN/h;

    move-result-object v0

    invoke-virtual {v0, p1}, LN/h;->n(LN/y;)V

    return-void
.end method

.method public final t(Lo2/c;)LN/h;
    .locals 3

    iget-object v0, p0, LN/E;->g:Lo2/c;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, LN/o;->l(Lo2/c;Lo2/c;Z)Lo2/c;

    move-result-object p1

    invoke-virtual {p0}, LN/E;->u()LN/h;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, LN/h;->t(Lo2/c;)LN/h;

    move-result-object v0

    invoke-static {v0, p1, v1}, LN/o;->h(LN/h;Lo2/c;Z)LN/h;

    move-result-object p1

    return-object p1
.end method

.method public final u()LN/h;
    .locals 1

    iget-object v0, p0, LN/E;->e:LN/h;

    if-nez v0, :cond_0

    sget-object v0, LN/o;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/h;

    :cond_0
    return-object v0
.end method
