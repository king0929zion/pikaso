.class public final LN/f;
.super LN/h;
.source "SourceFile"


# instance fields
.field public final e:Lo2/c;

.field public f:I


# direct methods
.method public constructor <init>(ILN/l;Lo2/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LN/h;-><init>(ILN/l;)V

    iput-object p3, p0, LN/f;->e:Lo2/c;

    const/4 p1, 0x1

    iput p1, p0, LN/f;->f:I

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-boolean v0, p0, LN/h;->c:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, LN/f;->l()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LN/h;->c:Z

    sget-object v0, LN/o;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LN/h;->d:I

    if-ltz v1, :cond_0

    invoke-static {v1}, LN/o;->u(I)V

    const/4 v1, -0x1

    iput v1, p0, LN/h;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    :goto_0
    return-void
.end method

.method public final f()Lo2/c;
    .locals 1

    iget-object v0, p0, LN/f;->e:Lo2/c;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final i()Lo2/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k()V
    .locals 1

    iget v0, p0, LN/f;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LN/f;->f:I

    return-void
.end method

.method public final l()V
    .locals 1

    iget v0, p0, LN/f;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LN/f;->f:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, LN/h;->a()V

    :cond_0
    return-void
.end method

.method public final m()V
    .locals 0

    return-void
.end method

.method public final n(LN/y;)V
    .locals 1

    sget-object p1, LN/o;->a:LB0/a;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot modify a state object in a read-only snapshot"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final t(Lo2/c;)LN/h;
    .locals 5

    invoke-static {p0}, LN/o;->d(LN/h;)V

    new-instance v0, LN/e;

    iget v1, p0, LN/h;->b:I

    iget-object v2, p0, LN/h;->a:LN/l;

    const/4 v3, 0x1

    iget-object v4, p0, LN/f;->e:Lo2/c;

    invoke-static {p1, v4, v3}, LN/o;->l(Lo2/c;Lo2/c;Z)Lo2/c;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1, p0}, LN/e;-><init>(ILN/l;Lo2/c;LN/h;)V

    return-object v0
.end method
