.class public final Lq/s;
.super LP/k;
.source "SourceFile"


# instance fields
.field public q:Ls/g;

.field public r:Ls/b;


# virtual methods
.method public final V()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final f0(Ls/g;Ls/f;)V
    .locals 4

    iget-boolean v0, p0, LP/k;->p:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LP/k;->U()Ly2/u;

    move-result-object v0

    check-cast v0, LD2/d;

    sget-object v1, Ly2/s;->e:Ly2/s;

    iget-object v0, v0, LD2/d;->d:Lg2/i;

    invoke-interface {v0, v1}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object v0

    check-cast v0, Ly2/S;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, LD/g;

    const/16 v3, 0xa

    invoke-direct {v2, p1, v3, p2}, LD/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-interface {v0, v2}, Ly2/S;->q(Lo2/c;)Ly2/C;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p0}, LP/k;->U()Ly2/u;

    move-result-object v2

    new-instance v3, Lq/r;

    invoke-direct {v3, p1, p2, v0, v1}, Lq/r;-><init>(Ls/g;Ls/f;Ly2/C;Lg2/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v2, v1, p2, v3, p1}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    goto :goto_1

    :cond_1
    invoke-virtual {p1, p2}, Ls/g;->b(Ls/f;)V

    :goto_1
    return-void
.end method
