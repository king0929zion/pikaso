.class public final LB2/q;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LB2/e;

.field public final synthetic k:LB2/G;

.field public final synthetic l:Ljava/lang/Float;


# direct methods
.method public constructor <init>(LB2/e;LB2/G;Ljava/lang/Float;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LB2/q;->j:LB2/e;

    iput-object p2, p0, LB2/q;->k:LB2/G;

    iput-object p3, p0, LB2/q;->l:Ljava/lang/Float;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 4

    new-instance v0, LB2/q;

    iget-object v1, p0, LB2/q;->k:LB2/G;

    iget-object v2, p0, LB2/q;->l:Ljava/lang/Float;

    iget-object v3, p0, LB2/q;->j:LB2/e;

    invoke-direct {v0, v3, v1, v2, p1}, LB2/q;-><init>(LB2/e;LB2/G;Ljava/lang/Float;Lg2/d;)V

    iput-object p2, v0, LB2/q;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LB2/y;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, LB2/q;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, LB2/q;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, LB2/q;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, LB2/q;->h:I

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

    iget-object p1, p0, LB2/q;->i:Ljava/lang/Object;

    check-cast p1, LB2/y;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    iget-object v1, p0, LB2/q;->k:LB2/G;

    if-eqz p1, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, LB2/w;->a:LD2/w;

    iget-object v0, p0, LB2/q;->l:Ljava/lang/Float;

    if-eq v0, p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {v1, p1, v0}, LB2/G;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "MutableStateFlow.resetReplayCache is not supported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iput v2, p0, LB2/q;->h:I

    iget-object p1, p0, LB2/q;->j:LB2/e;

    invoke-interface {p1, v1, p0}, LB2/e;->o(LB2/f;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
