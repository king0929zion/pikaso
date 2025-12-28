.class public final Lz/v;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lz/w;


# direct methods
.method public constructor <init>(Lz/w;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lz/v;->j:Lz/w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 2

    new-instance v0, Lz/v;

    iget-object v1, p0, Lz/v;->j:Lz/w;

    invoke-direct {v0, v1, p1}, Lz/v;-><init>(Lz/w;Lg2/d;)V

    iput-object p2, v0, Lz/v;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lz/v;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lz/v;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lz/v;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lz/v;->h:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object p1, p0, Lz/v;->i:Ljava/lang/Object;

    check-cast p1, Ly2/u;

    iget-object v1, p0, Lz/v;->j:Lz/w;

    iget-object v3, v1, Lz/w;->q:Ls/g;

    iget-object v3, v3, Ls/g;->a:LB2/v;

    new-instance v4, LB2/n;

    const/4 v5, 0x2

    invoke-direct {v4, v1, p1, v5}, LB2/n;-><init>(Ljava/lang/Object;Ly2/u;I)V

    iput v2, p0, Lz/v;->h:I

    invoke-static {v3, v4, p0}, LB2/v;->i(LB2/v;LB2/f;Lg2/d;)V

    return-object v0
.end method
