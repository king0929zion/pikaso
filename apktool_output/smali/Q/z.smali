.class public final Lq/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/k;


# static fields
.field public static final a:Lq/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq/z;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq/z;->a:Lq/z;

    return-void
.end method


# virtual methods
.method public final f(Ln0/L;Ljava/util/List;J)LM1/j;
    .locals 1

    invoke-static {p3, p4}, LG0/a;->j(J)I

    move-result p2

    invoke-static {p3, p4}, LG0/a;->i(J)I

    move-result p3

    sget-object p4, Lq/y;->e:Lq/y;

    sget-object v0, Ld2/t;->d:Ld2/t;

    invoke-virtual {p1, p2, p3, v0, p4}, Ln0/L;->b0(IILjava/util/Map;Lo2/c;)LM1/j;

    move-result-object p1

    return-object p1
.end method
