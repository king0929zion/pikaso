.class public final LC2/i;
.super LC2/h;
.source "SourceFile"


# virtual methods
.method public final a(Lg2/i;II)LC2/h;
    .locals 2

    new-instance v0, LC2/i;

    iget-object v1, p0, LC2/h;->g:LB2/e;

    invoke-direct {v0, v1, p1, p2, p3}, LC2/h;-><init>(LB2/e;Lg2/i;II)V

    return-object v0
.end method

.method public final b()LB2/e;
    .locals 1

    iget-object v0, p0, LC2/h;->g:LB2/e;

    return-object v0
.end method

.method public final c(LB2/f;Li2/c;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC2/h;->g:LB2/e;

    invoke-interface {v0, p1, p2}, LB2/e;->o(LB2/f;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lh2/a;->d:Lh2/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
