.class public final Ly2/n0;
.super LD2/t;
.source "SourceFile"


# instance fields
.field public final h:Ljava/lang/ThreadLocal;

.field private volatile threadLocalIsSet:Z


# direct methods
.method public constructor <init>(Lg2/i;Li2/c;)V
    .locals 2

    sget-object v0, Ly2/o0;->d:Ly2/o0;

    invoke-interface {p1, v0}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {p1, v0}, Lg2/i;->i(Lg2/i;)Lg2/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, p2, v0}, LD2/t;-><init>(Lg2/d;Lg2/i;)V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Ly2/n0;->h:Ljava/lang/ThreadLocal;

    invoke-interface {p2}, Lg2/d;->o()Lg2/i;

    move-result-object p2

    sget-object v0, Lg2/e;->d:Lg2/e;

    invoke-interface {p2, v0}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object p2

    instance-of p2, p2, Ly2/r;

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-static {p1, p2}, LD2/a;->m(Lg2/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, LD2/a;->g(Lg2/i;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Ly2/n0;->e0(Lg2/i;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final d0()Z
    .locals 3

    iget-boolean v0, p0, Ly2/n0;->threadLocalIsSet:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly2/n0;->h:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Ly2/n0;->h:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    xor-int/2addr v0, v1

    return v0
.end method

.method public final e0(Lg2/i;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly2/n0;->threadLocalIsSet:Z

    iget-object v0, p0, Ly2/n0;->h:Ljava/lang/ThreadLocal;

    new-instance v1, Lc2/g;

    invoke-direct {v1, p1, p2}, Lc2/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final z(Ljava/lang/Object;)V
    .locals 5

    iget-boolean v0, p0, Ly2/n0;->threadLocalIsSet:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ly2/n0;->h:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc2/g;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lc2/g;->d:Ljava/lang/Object;

    check-cast v1, Lg2/i;

    iget-object v0, v0, Lc2/g;->e:Ljava/lang/Object;

    invoke-static {v1, v0}, LD2/a;->g(Lg2/i;Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Ly2/n0;->h:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    :cond_1
    invoke-static {p1}, Ly2/v;->m(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LD2/t;->g:Lg2/d;

    invoke-interface {v0}, Lg2/d;->o()Lg2/i;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, LD2/a;->m(Lg2/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LD2/a;->f:LD2/w;

    if-eq v3, v4, :cond_2

    invoke-static {v0, v1, v3}, Ly2/v;->r(Lg2/d;Lg2/i;Ljava/lang/Object;)Ly2/n0;

    move-result-object v2

    :cond_2
    :try_start_0
    iget-object v0, p0, LD2/t;->g:Lg2/d;

    invoke-interface {v0, p1}, Lg2/d;->t(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ly2/n0;->d0()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    invoke-static {v1, v3}, LD2/a;->g(Lg2/i;Ljava/lang/Object;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ly2/n0;->d0()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    invoke-static {v1, v3}, LD2/a;->g(Lg2/i;Ljava/lang/Object;)V

    :cond_6
    throw p1
.end method
