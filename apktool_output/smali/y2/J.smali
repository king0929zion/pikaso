.class public abstract Ly2/J;
.super Ly2/r;
.source "SourceFile"


# static fields
.field public static final synthetic i:I


# instance fields
.field public f:J

.field public g:Z

.field public h:Ld2/i;


# virtual methods
.method public final j(Z)V
    .locals 4

    iget-wide v0, p0, Ly2/J;->f:J

    if-eqz p1, :cond_0

    const-wide v2, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    :goto_0
    sub-long/2addr v0, v2

    iput-wide v0, p0, Ly2/J;->f:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_1

    return-void

    :cond_1
    iget-boolean p1, p0, Ly2/J;->g:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ly2/J;->z()V

    :cond_2
    return-void
.end method

.method public final m(Ly2/A;)V
    .locals 1

    iget-object v0, p0, Ly2/J;->h:Ld2/i;

    if-nez v0, :cond_0

    new-instance v0, Ld2/i;

    invoke-direct {v0}, Ld2/i;-><init>()V

    iput-object v0, p0, Ly2/J;->h:Ld2/i;

    :cond_0
    invoke-virtual {v0, p1}, Ld2/i;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public abstract o()Ljava/lang/Thread;
.end method

.method public final p(Z)V
    .locals 4

    iget-wide v0, p0, Ly2/J;->f:J

    if-eqz p1, :cond_0

    const-wide v2, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    :goto_0
    add-long/2addr v2, v0

    iput-wide v2, p0, Ly2/J;->f:J

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Ly2/J;->g:Z

    :cond_1
    return-void
.end method

.method public final t()Z
    .locals 4

    iget-wide v0, p0, Ly2/J;->f:J

    const-wide v2, 0x100000000L

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract w()J
.end method

.method public final x()Z
    .locals 3

    iget-object v0, p0, Ly2/J;->h:Ld2/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Ld2/i;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ld2/i;->h()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, Ly2/A;

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {v0}, Ly2/A;->run()V

    const/4 v0, 0x1

    return v0
.end method

.method public y(JLy2/G;)V
    .locals 1

    sget-object v0, Ly2/w;->m:Ly2/w;

    invoke-virtual {v0, p1, p2, p3}, Ly2/I;->D(JLy2/G;)V

    return-void
.end method

.method public abstract z()V
.end method
