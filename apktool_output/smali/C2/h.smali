.class public abstract LC2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/q;


# instance fields
.field public final d:Lg2/i;

.field public final e:I

.field public final f:I

.field public final g:LB2/e;


# direct methods
.method public constructor <init>(LB2/e;Lg2/i;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LC2/h;->d:Lg2/i;

    iput p3, p0, LC2/h;->e:I

    iput p4, p0, LC2/h;->f:I

    iput-object p1, p0, LC2/h;->g:LB2/e;

    return-void
.end method


# virtual methods
.method public abstract a(Lg2/i;II)LC2/h;
.end method

.method public b()LB2/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract c(LB2/f;Li2/c;)Ljava/lang/Object;
.end method

.method public final d()Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v1, Lg2/j;->d:Lg2/j;

    iget-object v2, p0, LC2/h;->d:Lg2/i;

    if-eq v2, v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "context="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 v1, -0x3

    iget v2, p0, LC2/h;->e:I

    if-eq v2, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "capacity="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const/4 v1, 0x1

    iget v2, p0, LC2/h;->f:I

    if-eq v2, v1, :cond_5

    const/4 v1, 0x1

    if-eq v2, v1, :cond_4

    const/4 v1, 0x2

    if-eq v2, v1, :cond_3

    const/4 v1, 0x3

    if-eq v2, v1, :cond_2

    const-string v1, "null"

    goto :goto_0

    :cond_2
    const-string v1, "DROP_LATEST"

    goto :goto_0

    :cond_3
    const-string v1, "DROP_OLDEST"

    goto :goto_0

    :cond_4
    const-string v1, "SUSPEND"

    :goto_0
    const-string v2, "onBufferOverflow="

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v1, ", "

    const/4 v2, 0x0

    const/16 v5, 0x3e

    invoke-static/range {v0 .. v5}, Ld2/k;->d0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo2/c;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m(Lg2/i;II)LB2/e;
    .locals 4

    iget-object v0, p0, LC2/h;->d:Lg2/i;

    invoke-interface {p1, v0}, Lg2/i;->i(Lg2/i;)Lg2/i;

    move-result-object p1

    const/4 v1, 0x1

    iget v2, p0, LC2/h;->f:I

    iget v3, p0, LC2/h;->e:I

    if-eq p3, v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 p3, -0x3

    if-ne v3, p3, :cond_1

    goto :goto_1

    :cond_1
    if-ne p2, p3, :cond_2

    :goto_0
    move p2, v3

    goto :goto_1

    :cond_2
    const/4 p3, -0x2

    if-ne v3, p3, :cond_3

    goto :goto_1

    :cond_3
    if-ne p2, p3, :cond_4

    goto :goto_0

    :cond_4
    add-int/2addr p2, v3

    if-ltz p2, :cond_5

    goto :goto_1

    :cond_5
    const p2, 0x7fffffff

    :goto_1
    move p3, v2

    :goto_2
    invoke-static {p1, v0}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    if-ne p2, v3, :cond_6

    if-ne p3, v2, :cond_6

    return-object p0

    :cond_6
    invoke-virtual {p0, p1, p2, p3}, LC2/h;->a(Lg2/i;II)LC2/h;

    move-result-object p1

    return-object p1
.end method

.method public final o(LB2/f;Lg2/d;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lc2/m;->a:Lc2/m;

    sget-object v1, Lh2/a;->d:Lh2/a;

    iget v2, p0, LC2/h;->e:I

    const/4 v3, -0x3

    const/4 v4, 0x0

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, Lg2/d;->o()Lg2/i;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v5, Ly2/o;->g:Ly2/o;

    iget-object v6, p0, LC2/h;->d:Lg2/i;

    invoke-interface {v6, v3, v5}, Lg2/i;->l(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v2, v6}, Lg2/i;->i(Lg2/i;)Lg2/i;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    invoke-static {v2, v6, v3}, Ly2/v;->e(Lg2/i;Lg2/i;Z)Lg2/i;

    move-result-object v3

    :goto_0
    invoke-static {v3, v2}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    check-cast p2, Li2/c;

    invoke-virtual {p0, p1, p2}, LC2/h;->c(LB2/f;Li2/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_1
    move-object v0, p1

    goto :goto_6

    :cond_1
    sget-object v5, Lg2/e;->d:Lg2/e;

    invoke-interface {v3, v5}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object v6

    invoke-interface {v2, v5}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object v2

    invoke-static {v6, v2}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p2}, Lg2/d;->o()Lg2/i;

    move-result-object v2

    instance-of v5, p1, LC2/x;

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    instance-of v5, p1, LC2/s;

    :goto_2
    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    new-instance v5, LB2/c;

    invoke-direct {v5, p1, v2}, LB2/c;-><init>(LB2/f;Lg2/i;)V

    move-object p1, v5

    :goto_3
    new-instance v2, LC2/g;

    invoke-direct {v2, p0, v4}, LC2/g;-><init>(LC2/h;Lg2/d;)V

    invoke-static {v3}, LD2/a;->l(Lg2/i;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, p1, v4, v2, p2}, LC2/c;->a(Lg2/i;Ljava/lang/Object;Ljava/lang/Object;Lo2/e;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_4

    :cond_4
    move-object p1, v0

    :goto_4
    if-ne p1, v1, :cond_7

    goto :goto_1

    :cond_5
    new-instance v2, LC2/e;

    invoke-direct {v2, p1, p0, v4}, LC2/e;-><init>(LB2/f;LC2/h;Lg2/d;)V

    invoke-static {v2, p2}, Ly2/v;->b(Lo2/e;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_5

    :cond_6
    move-object p1, v0

    :goto_5
    if-ne p1, v1, :cond_7

    goto :goto_1

    :cond_7
    :goto_6
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LC2/h;->g:LB2/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LC2/h;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
