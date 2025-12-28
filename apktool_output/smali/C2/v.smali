.class public final synthetic LC2/v;
.super Lp2/f;
.source "SourceFile"

# interfaces
.implements Lo2/f;


# static fields
.field public static final l:LC2/v;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, LC2/v;

    const-string v4, "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v5, 0x0

    const/4 v1, 0x3

    const-class v2, LB2/f;

    const-string v3, "emit"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lp2/f;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v6, LC2/v;->l:LC2/v;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LB2/f;

    check-cast p3, Lg2/d;

    invoke-interface {p1, p2, p3}, LB2/f;->b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
