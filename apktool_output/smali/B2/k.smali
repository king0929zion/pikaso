.class public final LB2/k;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/f;


# instance fields
.field public h:I

.field public synthetic i:LB2/f;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:LB2/q;


# direct methods
.method public constructor <init>(LB2/q;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LB2/k;->k:LB2/q;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LB2/f;

    check-cast p3, Lg2/d;

    new-instance v0, LB2/k;

    iget-object v1, p0, LB2/k;->k:LB2/q;

    invoke-direct {v0, v1, p3}, LB2/k;-><init>(LB2/q;Lg2/d;)V

    iput-object p1, v0, LB2/k;->i:LB2/f;

    iput-object p2, v0, LB2/k;->j:Ljava/lang/Object;

    sget-object p1, Lc2/m;->a:Lc2/m;

    invoke-virtual {v0, p1}, LB2/k;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, LB2/k;->h:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LB2/k;->i:LB2/f;

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object v1, p0, LB2/k;->i:LB2/f;

    iget-object p1, p0, LB2/k;->j:Ljava/lang/Object;

    iput-object v1, p0, LB2/k;->i:LB2/f;

    iput v3, p0, LB2/k;->h:I

    iget-object v3, p0, LB2/k;->k:LB2/q;

    invoke-virtual {v3, p1, p0}, LB2/q;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    const/4 v3, 0x0

    iput-object v3, p0, LB2/k;->i:LB2/f;

    iput v2, p0, LB2/k;->h:I

    invoke-interface {v1, p1, p0}, LB2/f;->b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
