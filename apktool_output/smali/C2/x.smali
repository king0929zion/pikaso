.class public final LC2/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB2/f;


# instance fields
.field public final d:LA2/q;


# direct methods
.method public constructor <init>(LA2/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC2/x;->d:LA2/q;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC2/x;->d:LA2/q;

    invoke-interface {v0, p2, p1}, LA2/q;->p(Lg2/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lh2/a;->d:Lh2/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
