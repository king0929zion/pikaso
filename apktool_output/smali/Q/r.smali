.class public final Lq/r;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public final synthetic i:Ls/g;

.field public final synthetic j:Ls/f;

.field public final synthetic k:Ly2/C;


# direct methods
.method public constructor <init>(Ls/g;Ls/f;Ly2/C;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lq/r;->i:Ls/g;

    iput-object p2, p0, Lq/r;->j:Ls/f;

    iput-object p3, p0, Lq/r;->k:Ly2/C;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 3

    new-instance p2, Lq/r;

    iget-object v0, p0, Lq/r;->j:Ls/f;

    iget-object v1, p0, Lq/r;->k:Ly2/C;

    iget-object v2, p0, Lq/r;->i:Ls/g;

    invoke-direct {p2, v2, v0, v1, p1}, Lq/r;-><init>(Ls/g;Ls/f;Ly2/C;Lg2/d;)V

    return-object p2
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lq/r;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lq/r;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lq/r;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lq/r;->h:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iput v2, p0, Lq/r;->h:I

    iget-object p1, p0, Lq/r;->j:Ls/f;

    iget-object v1, p0, Lq/r;->i:Ls/g;

    invoke-virtual {v1, p1, p0}, Ls/g;->a(Ls/f;Li2/j;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lq/r;->k:Ly2/C;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ly2/C;->d()V

    :cond_3
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
