.class public final Lh0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG0/b;
.implements Lg2/d;


# instance fields
.field public final d:Ly2/f;

.field public final synthetic e:Lh0/r;

.field public f:Ly2/f;

.field public g:Lh0/g;

.field public final synthetic h:Lh0/r;


# direct methods
.method public constructor <init>(Lh0/r;Ly2/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/p;->h:Lh0/r;

    iput-object p2, p0, Lh0/p;->d:Ly2/f;

    iput-object p1, p0, Lh0/p;->e:Lh0/r;

    sget-object p1, Lh0/g;->e:Lh0/g;

    iput-object p1, p0, Lh0/p;->g:Lh0/g;

    return-void
.end method


# virtual methods
.method public final J(F)J
    .locals 2

    iget-object v0, p0, Lh0/p;->e:Lh0/r;

    invoke-interface {v0, p1}, LG0/b;->J(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final O(J)F
    .locals 1

    iget-object v0, p0, Lh0/p;->e:Lh0/r;

    invoke-interface {v0, p1, p2}, LG0/b;->O(J)F

    move-result p1

    return p1
.end method

.method public final P(F)F
    .locals 1

    iget-object v0, p0, Lh0/p;->e:Lh0/r;

    invoke-virtual {v0}, Lh0/r;->n()F

    move-result v0

    div-float/2addr p1, v0

    return p1
.end method

.method public final a(Lh0/g;Li2/a;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Ly2/f;

    invoke-static {p2}, LZ/b;->z(Lg2/d;)Lg2/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Ly2/f;-><init>(ILg2/d;)V

    invoke-virtual {v0}, Ly2/f;->u()V

    iput-object p1, p0, Lh0/p;->g:Lh0/g;

    iput-object v0, p0, Lh0/p;->f:Ly2/f;

    invoke-virtual {v0}, Ly2/f;->s()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(F)I
    .locals 1

    iget-object v0, p0, Lh0/p;->e:Lh0/r;

    invoke-interface {v0, p1}, LG0/b;->b(F)I

    move-result p1

    return p1
.end method

.method public final f()F
    .locals 1

    iget-object v0, p0, Lh0/p;->e:Lh0/r;

    invoke-virtual {v0}, Lh0/r;->f()F

    move-result v0

    return v0
.end method

.method public final n()F
    .locals 1

    iget-object v0, p0, Lh0/p;->e:Lh0/r;

    invoke-virtual {v0}, Lh0/r;->n()F

    move-result v0

    return v0
.end method

.method public final o()Lg2/i;
    .locals 1

    sget-object v0, Lg2/j;->d:Lg2/j;

    return-object v0
.end method

.method public final q(J)J
    .locals 1

    iget-object v0, p0, Lh0/p;->e:Lh0/r;

    invoke-interface {v0, p1, p2}, LG0/b;->q(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final s(F)J
    .locals 2

    iget-object v0, p0, Lh0/p;->e:Lh0/r;

    invoke-interface {v0, p1}, LG0/b;->s(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final t(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lh0/p;->h:Lh0/r;

    iget-object v1, v0, Lh0/r;->w:LF/d;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Lh0/r;->w:LF/d;

    invoke-virtual {v0, p0}, LF/d;->l(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iget-object v0, p0, Lh0/p;->d:Ly2/f;

    invoke-virtual {v0, p1}, Ly2/f;->t(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final u(F)F
    .locals 1

    iget-object v0, p0, Lh0/p;->e:Lh0/r;

    invoke-virtual {v0}, Lh0/r;->n()F

    move-result v0

    mul-float/2addr v0, p1

    return v0
.end method

.method public final v(J)F
    .locals 1

    iget-object v0, p0, Lh0/p;->e:Lh0/r;

    invoke-interface {v0, p1, p2}, LG0/b;->v(J)F

    move-result p1

    return p1
.end method
