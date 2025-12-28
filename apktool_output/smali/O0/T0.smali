.class public final Lo0/T0;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public final synthetic i:LB2/E;

.field public final synthetic j:Lo0/p0;


# direct methods
.method public constructor <init>(LB2/E;Lo0/p0;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lo0/T0;->i:LB2/E;

    iput-object p2, p0, Lo0/T0;->j:Lo0/p0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 2

    new-instance p2, Lo0/T0;

    iget-object v0, p0, Lo0/T0;->i:LB2/E;

    iget-object v1, p0, Lo0/T0;->j:Lo0/p0;

    invoke-direct {p2, v0, v1, p1}, Lo0/T0;-><init>(LB2/E;Lo0/p0;Lg2/d;)V

    return-object p2
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lo0/T0;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lo0/T0;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lo0/T0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lh2/a;->d:Lh2/a;

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lo0/T0;->h:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    new-instance p1, LA/d;

    iget-object v1, p0, Lo0/T0;->j:Lo0/p0;

    const/4 v3, 0x1

    invoke-direct {p1, v3, v1}, LA/d;-><init>(ILjava/lang/Object;)V

    iput v2, p0, Lo0/T0;->h:I

    iget-object v1, p0, Lo0/T0;->i:LB2/E;

    invoke-interface {v1, p1, p0}, LB2/e;->o(LB2/f;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, LB1/c;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method
