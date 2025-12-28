.class public abstract LP/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/h;


# instance fields
.field public d:LP/k;

.field public e:LD2/d;

.field public f:I

.field public g:I

.field public h:LP/k;

.field public i:LP/k;

.field public j:Ln0/b0;

.field public k:Ln0/Y;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LP/k;->d:LP/k;

    const/4 v0, -0x1

    iput v0, p0, LP/k;->g:I

    return-void
.end method


# virtual methods
.method public final U()Ly2/u;
    .locals 3

    iget-object v0, p0, LP/k;->e:LD2/d;

    if-nez v0, :cond_0

    invoke-static {p0}, Ln0/C;->r(Ln0/h;)Ln0/e0;

    move-result-object v0

    check-cast v0, Lo0/u;

    invoke-virtual {v0}, Lo0/u;->getCoroutineContext()Lg2/i;

    move-result-object v0

    invoke-static {p0}, Ln0/C;->r(Ln0/h;)Ln0/e0;

    move-result-object v1

    check-cast v1, Lo0/u;

    invoke-virtual {v1}, Lo0/u;->getCoroutineContext()Lg2/i;

    move-result-object v1

    sget-object v2, Ly2/s;->e:Ly2/s;

    invoke-interface {v1, v2}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object v1

    check-cast v1, Ly2/S;

    new-instance v2, Ly2/V;

    invoke-direct {v2, v1}, Ly2/V;-><init>(Ly2/S;)V

    invoke-interface {v0, v2}, Lg2/i;->i(Lg2/i;)Lg2/i;

    move-result-object v0

    invoke-static {v0}, Ly2/v;->a(Lg2/i;)LD2/d;

    move-result-object v0

    iput-object v0, p0, LP/k;->e:LD2/d;

    :cond_0
    return-object v0
.end method

.method public V()Z
    .locals 1

    instance-of v0, p0, Lq/q;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public W()V
    .locals 2

    iget-boolean v0, p0, LP/k;->p:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, LP/k;->k:Ln0/Y;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LP/k;->p:Z

    iput-boolean v0, p0, LP/k;->n:Z

    return-void

    :cond_0
    const-string v0, "attach invoked on a node without a coordinator"

    invoke-static {v0}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "node attached multiple times"

    invoke-static {v0}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1
.end method

.method public X()V
    .locals 5

    iget-boolean v0, p0, LP/k;->p:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, LP/k;->n:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, LP/k;->o:Z

    if-nez v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, LP/k;->p:Z

    iget-object v0, p0, LP/k;->e:LD2/d;

    if-eqz v0, :cond_1

    new-instance v2, LC2/o;

    const-string v3, "The Modifier.Node was detached"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, LC2/o;-><init>(Ljava/lang/String;I)V

    sget-object v3, Ly2/s;->e:Ly2/s;

    iget-object v4, v0, LD2/d;->d:Lg2/i;

    invoke-interface {v4, v3}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object v3

    check-cast v3, Ly2/S;

    if-eqz v3, :cond_0

    invoke-interface {v3, v2}, Ly2/S;->a(Ljava/util/concurrent/CancellationException;)V

    iput-object v1, p0, LP/k;->e:LD2/d;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Scope cannot be cancelled because it does not have a job: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    return-void

    :cond_2
    const-string v0, "Must run runDetachLifecycle() before markAsDetached()"

    invoke-static {v0}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1

    :cond_3
    const-string v0, "Must run runAttachLifecycle() before markAsDetached()"

    invoke-static {v0}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1

    :cond_4
    const-string v0, "Cannot detach a node that is not attached"

    invoke-static {v0}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1
.end method

.method public Y()V
    .locals 0

    return-void
.end method

.method public Z()V
    .locals 0

    return-void
.end method

.method public a0()V
    .locals 1

    iget-boolean v0, p0, LP/k;->p:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "reset() called on an unattached node"

    invoke-static {v0}, LZ0/d;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public b0()V
    .locals 2

    iget-boolean v0, p0, LP/k;->p:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LP/k;->n:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LP/k;->n:Z

    invoke-virtual {p0}, LP/k;->Y()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LP/k;->o:Z

    return-void

    :cond_0
    const-string v0, "Must run runAttachLifecycle() only once after markAsAttached()"

    invoke-static {v0}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "Must run markAsAttached() prior to runAttachLifecycle"

    invoke-static {v0}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1
.end method

.method public c0()V
    .locals 2

    iget-boolean v0, p0, LP/k;->p:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, LP/k;->k:Ln0/Y;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LP/k;->o:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LP/k;->o:Z

    invoke-virtual {p0}, LP/k;->Z()V

    return-void

    :cond_0
    const-string v0, "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()"

    invoke-static {v0}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "detach invoked on a node without a coordinator"

    invoke-static {v0}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1

    :cond_2
    const-string v0, "node detached multiple times"

    invoke-static {v0}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1
.end method

.method public d0(LP/k;)V
    .locals 0

    iput-object p1, p0, LP/k;->d:LP/k;

    return-void
.end method

.method public e0(Ln0/Y;)V
    .locals 0

    iput-object p1, p0, LP/k;->k:Ln0/Y;

    return-void
.end method
