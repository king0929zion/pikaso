.class public final Lh2/c;
.super Li2/c;
.source "SourceFile"


# instance fields
.field public g:I

.field public final synthetic h:Lo2/e;

.field public final synthetic i:Lg2/d;


# direct methods
.method public constructor <init>(Lg2/d;Lg2/i;Lo2/e;Lg2/d;)V
    .locals 0

    iput-object p3, p0, Lh2/c;->h:Lo2/e;

    iput-object p4, p0, Lh2/c;->i:Lg2/d;

    invoke-direct {p0, p1, p2}, Li2/c;-><init>(Lg2/d;Lg2/i;)V

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lh2/c;->g:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v2, :cond_0

    iput v1, p0, Lh2/c;->g:I

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This coroutine had already completed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput v2, p0, Lh2/c;->g:I

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/c;->h:Lo2/e;

    const-string v0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>"

    invoke-static {p1, v0}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p1}, Lp2/r;->c(ILjava/lang/Object;)V

    iget-object v0, p0, Lh2/c;->i:Lg2/d;

    invoke-interface {p1, v0, p0}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method
